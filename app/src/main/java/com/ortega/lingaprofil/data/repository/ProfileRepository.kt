package com.ortega.lingaprofil.data.repository

import com.ortega.lingaprofil.data.datasource.ProfileDAO
import com.ortega.lingaprofil.data.datasource.ProfileEntity
import javax.inject.Inject

/**
 * Profile Repository,
 *
 * Implements all actions of our Profile DAO
 *
 * @property profileDAO
 */
class ProfileRepository @Inject constructor(private val profileDAO: ProfileDAO) {

    suspend fun insert(profile: ProfileEntity) = profileDAO.insertProfile(profile)
    suspend fun delete(profile: ProfileEntity) = profileDAO.deleteProfile(profile)
    suspend fun update(profile: ProfileEntity) = profileDAO.updateProfile(profile)
    suspend fun favoriteProfile(isFavorite: Boolean, id: Int) = profileDAO.favoriteProfile(isFavorite, id)
    fun getAll() = profileDAO.getAll()
    fun getProfile(id: Int) = profileDAO.getProfile(id)
    fun getFavoriteProfile(isFavorite: Boolean) = profileDAO.getFavoriteProfile(isFavorite)

}