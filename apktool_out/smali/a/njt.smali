.class public abstract La/njt;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 23

    .line 1
    new-instance v1, La/ojt;

    .line 2
    .line 3
    const-string v0, "hms_impl"

    .line 4
    .line 5
    const-string v2, "HMS (Huawei Mobile Services)"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-direct {v1, v0, v2, v3}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 9
    .line 10
    .line 11
    new-instance v2, La/ojt;

    .line 12
    .line 13
    const-string v0, "app_update_impl"

    .line 14
    .line 15
    const-string v4, "\u041e\u0431\u043d\u043e\u0432\u043b\u0435\u043d\u0438\u0435 \u043f\u0440\u0438\u043b\u043e\u0436\u0435\u043d\u0438\u044f (\u043d\u0430\u043f\u0440\u044f\u043c\u0443\u044e, APK)"

    .line 16
    .line 17
    invoke-direct {v2, v0, v4, v3}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    new-instance v0, La/ojt;

    .line 21
    .line 22
    const-string v4, "google_update_impl"

    .line 23
    .line 24
    const-string v5, "\u041e\u0431\u043d\u043e\u0432\u043b\u0435\u043d\u0438\u0435 \u043f\u0440\u0438\u043b\u043e\u0436\u0435\u043d\u0438\u044f (Google Play In-App Update)"

    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    invoke-direct {v0, v4, v5, v6}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 28
    .line 29
    .line 30
    new-instance v4, La/ojt;

    .line 31
    .line 32
    const-string v5, "aggregator_impl"

    .line 33
    .line 34
    const-string v7, "Aggregator (\u0430\u0433\u0440\u0435\u0433\u0430\u0442\u043e\u0440 \u0438\u0433\u0440)"

    .line 35
    .line 36
    invoke-direct {v4, v5, v7, v3}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    new-instance v5, La/ojt;

    .line 40
    .line 41
    const-string v7, "banners_impl"

    .line 42
    .line 43
    const-string v8, "\u0411\u0430\u043d\u043d\u0435\u0440\u044b"

    .line 44
    .line 45
    invoke-direct {v5, v7, v8, v3}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 46
    .line 47
    .line 48
    new-instance v7, La/ojt;

    .line 49
    .line 50
    const-string v8, "games_section_impl"

    .line 51
    .line 52
    const-string v9, "Games Section (\u043a\u0430\u0437\u0438\u043d\u043e)"

    .line 53
    .line 54
    invoke-direct {v7, v8, v9, v3}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 55
    .line 56
    .line 57
    move-object v8, v7

    .line 58
    new-instance v7, La/ojt;

    .line 59
    .line 60
    const-string v9, "admob_impl"

    .line 61
    .line 62
    const-string v10, "AdMob"

    .line 63
    .line 64
    invoke-direct {v7, v9, v10, v6}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 65
    .line 66
    .line 67
    move-object v9, v8

    .line 68
    new-instance v8, La/ojt;

    .line 69
    .line 70
    const-string v10, "facebook_events_manager_impl"

    .line 71
    .line 72
    const-string v11, "Facebook Events Manager"

    .line 73
    .line 74
    invoke-direct {v8, v10, v11, v6}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 75
    .line 76
    .line 77
    move-object v10, v9

    .line 78
    new-instance v9, La/ojt;

    .line 79
    .line 80
    const-string v11, "finsecurity_v2_impl"

    .line 81
    .line 82
    const-string v12, "Finsecurity v2"

    .line 83
    .line 84
    invoke-direct {v9, v11, v12, v6}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 85
    .line 86
    .line 87
    move-object v11, v10

    .line 88
    new-instance v10, La/ojt;

    .line 89
    .line 90
    const-string v12, "user_agreement_impl"

    .line 91
    .line 92
    const-string v13, "\u041f\u043e\u043b\u044c\u0437\u043e\u0432\u0430\u0442\u0435\u043b\u044c\u0441\u043a\u043e\u0435 \u0441\u043e\u0433\u043b\u0430\u0448\u0435\u043d\u0438\u0435 (\u043a\u0430\u0441\u0442\u043e\u043c\u043d\u043e\u0435)"

    .line 93
    .line 94
    invoke-direct {v10, v12, v13, v6}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 95
    .line 96
    .line 97
    move-object v12, v11

    .line 98
    new-instance v11, La/ojt;

    .line 99
    .line 100
    const-string v13, "back_office"

    .line 101
    .line 102
    const-string v14, "\u0412\u0435\u0440\u0438\u0444\u0438\u043a\u0430\u0446\u0438\u044f: Back Office"

    .line 103
    .line 104
    invoke-direct {v11, v13, v14, v6}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 105
    .line 106
    .line 107
    move-object v13, v12

    .line 108
    new-instance v12, La/ojt;

    .line 109
    .line 110
    const-string v14, "democonfig"

    .line 111
    .line 112
    const-string v15, "\u0414\u0435\u043c\u043e-\u043a\u043e\u043d\u0444\u0438\u0433\u0443\u0440\u0430\u0446\u0438\u044f"

    .line 113
    .line 114
    invoke-direct {v12, v14, v15, v6}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 115
    .line 116
    .line 117
    move-object v14, v13

    .line 118
    new-instance v13, La/ojt;

    .line 119
    .line 120
    const-string v15, "smart_id"

    .line 121
    .line 122
    const-string v3, "\u0412\u0435\u0440\u0438\u0444\u0438\u043a\u0430\u0446\u0438\u044f: Smart-ID"

    .line 123
    .line 124
    invoke-direct {v13, v15, v3, v6}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 125
    .line 126
    .line 127
    move-object v3, v14

    .line 128
    new-instance v14, La/ojt;

    .line 129
    .line 130
    const-string v15, "mobile_id"

    .line 131
    .line 132
    move-object/from16 v17, v0

    .line 133
    .line 134
    const-string v0, "\u0412\u0435\u0440\u0438\u0444\u0438\u043a\u0430\u0446\u0438\u044f: Mobile-ID"

    .line 135
    .line 136
    invoke-direct {v14, v15, v0, v6}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 137
    .line 138
    .line 139
    new-instance v15, La/ojt;

    .line 140
    .line 141
    const-string v0, "sum_sub"

    .line 142
    .line 143
    move-object/from16 v18, v1

    .line 144
    .line 145
    const-string v1, "\u0412\u0435\u0440\u0438\u0444\u0438\u043a\u0430\u0446\u0438\u044f: Sum&Substance"

    .line 146
    .line 147
    invoke-direct {v15, v0, v1, v6}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 148
    .line 149
    .line 150
    new-instance v0, La/ojt;

    .line 151
    .line 152
    const-string v1, "nomapay"

    .line 153
    .line 154
    move-object/from16 v19, v2

    .line 155
    .line 156
    const-string v2, "\u0412\u0435\u0440\u0438\u0444\u0438\u043a\u0430\u0446\u0438\u044f: NomaPay"

    .line 157
    .line 158
    invoke-direct {v0, v1, v2, v6}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 159
    .line 160
    .line 161
    new-instance v1, La/ojt;

    .line 162
    .line 163
    const-string v2, "security_service"

    .line 164
    .line 165
    const-string v6, "Security Service"

    .line 166
    .line 167
    move-object/from16 v21, v0

    .line 168
    .line 169
    const/4 v0, 0x1

    .line 170
    invoke-direct {v1, v2, v6, v0}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 171
    .line 172
    .line 173
    new-instance v2, La/ojt;

    .line 174
    .line 175
    const-string v6, "xTest_tools_impl"

    .line 176
    .line 177
    const-string v0, "Test Tools SDK"

    .line 178
    .line 179
    move-object/from16 v22, v1

    .line 180
    .line 181
    const/4 v1, 0x0

    .line 182
    invoke-direct {v2, v6, v0, v1}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 183
    .line 184
    .line 185
    new-instance v0, La/ojt;

    .line 186
    .line 187
    const-string v1, "stub"

    .line 188
    .line 189
    const-string v6, "Stub (\u0437\u0430\u0433\u043b\u0443\u0448\u043a\u0430 \u043f\u043e \u0443\u043c\u043e\u043b\u0447\u0430\u043d\u0438\u044e)"

    .line 190
    .line 191
    move-object/from16 v20, v2

    .line 192
    .line 193
    const/4 v2, 0x1

    .line 194
    invoke-direct {v0, v1, v6, v2}, La/ojt;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    .line 195
    .line 196
    .line 197
    move-object v6, v3

    .line 198
    move-object/from16 v3, v17

    .line 199
    .line 200
    move-object/from16 v1, v18

    .line 201
    .line 202
    move-object/from16 v2, v19

    .line 203
    .line 204
    move-object/from16 v18, v20

    .line 205
    .line 206
    move-object/from16 v16, v21

    .line 207
    .line 208
    move-object/from16 v17, v22

    .line 209
    .line 210
    move-object/from16 v19, v0

    .line 211
    .line 212
    filled-new-array/range {v1 .. v19}, [La/ojt;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 217
    .line 218
    .line 219
    move-result-object v0

    .line 220
    sput-object v0, La/njt;->a:Ljava/util/List;

    .line 221
    .line 222
    return-void
.end method
