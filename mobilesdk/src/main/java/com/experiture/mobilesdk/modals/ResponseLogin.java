package com.experiture.mobilesdk.modals;

import com.google.gson.annotations.SerializedName;

public class ResponseLogin {
    @SerializedName("Success")
    Boolean Success;
    @SerializedName("msg")
    String msg;
    @SerializedName("User_Details")
    UserDetails User_Details;

    public Boolean getSuccess() {
        return Success;
    }

    public void setSuccess(Boolean success) {
        Success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public UserDetails getUser_Details() {
        return User_Details;
    }

    public void setUser_Details(UserDetails user_Details) {
        User_Details = user_Details;
    }

    @Override
    public String toString() {
        return "ResponseLogin{" +
                "Success=" + Success +
                ", msg='" + msg + '\'' +
                ", User_Details=" + User_Details +
                '}';
    }

    public class UserDetails {
        @SerializedName("Name")
        String Name;
        @SerializedName("TargetId")
        String TargetId;
        @SerializedName("UserPoints")
        Integer UserPoints;
        @SerializedName("Tire")
        String Tire;
        @SerializedName("PlayerId")
        String PlayerId;
        @SerializedName("AsOfDate")
        String AsOfDate;
        @SerializedName("NextTierLevel")
        String NextTierLevel;
        @SerializedName("DaysRemening")
        String DaysRemening;
        @SerializedName("TierPoint")
        String TierPoint;
        @SerializedName("Comps")
        String Comps;
        @SerializedName("NextRequalTier")
        String NextRequalTier;
        @SerializedName("CreditToNextTier")
        String CreditToNextTier;
        @SerializedName("DateToEarnby")
        String DateToEarnby;
        @SerializedName("TierExpiration")
        String TierExpiration;

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public String getTargetId() {
            return TargetId;
        }

        public void setTargetId(String targetId) {
            TargetId = targetId;
        }

        public Integer getUserPoints() {
            return UserPoints;
        }

        public void setUserPoints(Integer userPoints) {
            UserPoints = userPoints;
        }

        public String getTire() {
            return Tire;
        }

        public void setTire(String tire) {
            Tire = tire;
        }

        public String getPlayerId() {
            return PlayerId;
        }

        public void setPlayerId(String playerId) {
            PlayerId = playerId;
        }

        public String getAsOfDate() {
            return AsOfDate;
        }

        public void setAsOfDate(String asOfDate) {
            AsOfDate = asOfDate;
        }

        public String getNextTierLevel() {
            return NextTierLevel;
        }

        public void setNextTierLevel(String nextTierLevel) {
            NextTierLevel = nextTierLevel;
        }

        public String getDaysRemening() {
            return DaysRemening;
        }

        public void setDaysRemening(String daysRemening) {
            DaysRemening = daysRemening;
        }

        public String getTierPoint() {
            return TierPoint;
        }

        public void setTierPoint(String tierPoint) {
            TierPoint = tierPoint;
        }

        public String getComps() {
            return Comps;
        }

        public void setComps(String comps) {
            Comps = comps;
        }

        public String getNextRequalTier() {
            return NextRequalTier;
        }

        public void setNextRequalTier(String nextRequalTier) {
            NextRequalTier = nextRequalTier;
        }

        public String getCreditToNextTier() {
            return CreditToNextTier;
        }

        public void setCreditToNextTier(String creditToNextTier) {
            CreditToNextTier = creditToNextTier;
        }

        public String getDateToEarnby() {
            return DateToEarnby;
        }

        public void setDateToEarnby(String dateToEarnby) {
            DateToEarnby = dateToEarnby;
        }

        public String getTierExpiration() {
            return TierExpiration;
        }

        public void setTierExpiration(String tierExpiration) {
            TierExpiration = tierExpiration;
        }

        @Override
        public String toString() {
            return "UserDetails{" +
                    "Name='" + Name + '\'' +
                    ", TargetId='" + TargetId + '\'' +
                    ", UserPoints=" + UserPoints +
                    ", Tire='" + Tire + '\'' +
                    ", PlayerId='" + PlayerId + '\'' +
                    ", AsOfDate='" + AsOfDate + '\'' +
                    ", NextTierLevel='" + NextTierLevel + '\'' +
                    ", DaysRemening='" + DaysRemening + '\'' +
                    ", TierPoint='" + TierPoint + '\'' +
                    ", Comps='" + Comps + '\'' +
                    ", NextRequalTier='" + NextRequalTier + '\'' +
                    ", CreditToNextTier='" + CreditToNextTier + '\'' +
                    ", DateToEarnby='" + DateToEarnby + '\'' +
                    ", TierExpiration='" + TierExpiration + '\'' +
                    '}';
        }
    }
}
