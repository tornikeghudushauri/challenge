package org.developmentaid.challenge.model

import com.google.gson.annotations.SerializedName
import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
        @SerializedName("about_me")
        val aboutMe: String?,
        @SerializedName("accept_rate")
        val acceptRate: Int?,
        @SerializedName("account_id")
        val accountId: Int,
        val age: Int?,
        @SerializedName("answer_count")
        val answerCount: Int,
        @SerializedName("badge_counts")
        val badgeCounts: BadgeCountsDto,
        val collectives: List<CollectiveMembershipDto>?,
        @SerializedName("creation_date")
        val creationDate: Long,
        @SerializedName("display_name")
        val displayName: String,
        @SerializedName("down_vote_count")
        val downVoteCount: Int,
        @SerializedName("is_employee")
        val isEmployee: Boolean,
        @SerializedName("last_access_date")
        val lastAccessDate: Long,
        @SerializedName("last_modified_date")
        val lastModifiedDate: Long?,
        val link: String,
        val location: String?,
        @SerializedName("profile_image")
        val profileImage: String,
        @SerializedName("question_count")
        val questionCount: Int,
        val reputation: Int,
        @SerializedName("reputation_change_day")
        val reputationChangeDay: Int,
        @SerializedName("reputation_change_month")
        val reputationChangeMonth: Int,
        @SerializedName("reputation_change_quarter")
        val reputationChangeQuarter: Int,
        @SerializedName("reputation_change_week")
        val reputationChangeWeek: Int,
        @SerializedName("reputation_change_year")
        val reputationChangeYear: Int,
        @SerializedName("timed_penalty_date")
        val timedPenaltyDate: Long?,
        @SerializedName("up_vote_count")
        val upVoteCount: Int,
        @SerializedName("user_id")
        val userId: Int,
        @SerializedName("user_type")
        val userType: String,
        @SerializedName("view_count")
        val viewCount: Int,
        @SerializedName("website_url")
        val websiteUrl: String?
)