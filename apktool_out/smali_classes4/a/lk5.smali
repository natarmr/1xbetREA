.class public final La/lk5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pru;

.field public final b:La/r9u;


# direct methods
.method public constructor <init>(La/pru;La/r9u;B)V
    .locals 0

    .line 1
    packed-switch p3, :pswitch_data_0

    .line 2
    .line 3
    .line 4
    :pswitch_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/lk5;->a:La/pru;

    .line 11
    .line 12
    iput-object p2, p0, La/lk5;->b:La/r9u;

    .line 13
    .line 14
    return-void

    .line 15
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, La/lk5;->a:La/pru;

    .line 25
    .line 26
    iput-object p2, p0, La/lk5;->b:La/r9u;

    .line 27
    .line 28
    return-void

    .line 29
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, La/lk5;->a:La/pru;

    .line 33
    .line 34
    iput-object p2, p0, La/lk5;->b:La/r9u;

    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public constructor <init>(La/r9u;La/pru;)V
    .locals 0

    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, La/lk5;->b:La/r9u;

    .line 39
    iput-object p2, p0, La/lk5;->a:La/pru;

    return-void
.end method

.method public static b(La/lk5;)Lorg/xplatform/feature/balance_management/impl/balance_management/BalanceManagementScreenFactoryImpl$getScreen$1;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lorg/xplatform/feature/balance_management/impl/balance_management/BalanceManagementScreenFactoryImpl$getScreen$1;

    .line 5
    .line 6
    const-string v1, ""

    .line 7
    .line 8
    invoke-direct {v0, p0, v1}, Lorg/xplatform/feature/balance_management/impl/balance_management/BalanceManagementScreenFactoryImpl$getScreen$1;-><init>(La/lk5;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method


# virtual methods
.method public a()La/lk5;
    .locals 3

    .line 1
    new-instance v0, La/lk5;

    .line 2
    .line 3
    iget-object v1, p0, La/lk5;->b:La/r9u;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object p0, p0, La/lk5;->a:La/pru;

    .line 7
    .line 8
    invoke-direct {v0, p0, v1, v2}, La/lk5;-><init>(La/pru;La/r9u;B)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public c(La/j820;)La/ua20;
    .locals 4

    .line 1
    iget-object v0, p0, La/lk5;->a:La/pru;

    .line 2
    .line 3
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v0, v0, La/sff0;->a:La/gx7;

    .line 8
    .line 9
    iget-object v0, v0, La/gx7;->o:La/ua20;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x1

    .line 16
    if-eq v0, v1, :cond_8

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    if-eq v0, v2, :cond_7

    .line 20
    .line 21
    const/4 v3, 0x3

    .line 22
    if-eq v0, v3, :cond_0

    .line 23
    .line 24
    sget-object p0, La/ua20;->b:La/ua20;

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    sget-object v0, La/xju;->a:[I

    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    aget p1, v0, p1

    .line 34
    .line 35
    iget-object p0, p0, La/lk5;->b:La/r9u;

    .line 36
    .line 37
    if-ne p1, v1, :cond_1

    .line 38
    .line 39
    sget-object v0, La/ygp;->w:La/ygp;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object v1, p0, La/r9u;->a:La/j1q0;

    .line 45
    .line 46
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, La/m1q0;->d(La/ygp;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    sget-object p0, La/ua20;->e:La/ua20;

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_1
    if-ne p1, v2, :cond_2

    .line 61
    .line 62
    sget-object v0, La/ygp;->y:La/ygp;

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    iget-object v1, p0, La/r9u;->a:La/j1q0;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 73
    .line 74
    invoke-virtual {v1, v0}, La/m1q0;->d(La/ygp;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-eqz v0, :cond_2

    .line 79
    .line 80
    sget-object p0, La/ua20;->e:La/ua20;

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_2
    if-ne p1, v3, :cond_3

    .line 84
    .line 85
    sget-object v0, La/ygp;->z:La/ygp;

    .line 86
    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    iget-object v1, p0, La/r9u;->a:La/j1q0;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 96
    .line 97
    invoke-virtual {v1, v0}, La/m1q0;->d(La/ygp;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    sget-object p0, La/ua20;->e:La/ua20;

    .line 104
    .line 105
    return-object p0

    .line 106
    :cond_3
    const/4 v0, 0x4

    .line 107
    if-ne p1, v0, :cond_4

    .line 108
    .line 109
    sget-object v0, La/ygp;->m:La/ygp;

    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    iget-object v1, p0, La/r9u;->a:La/j1q0;

    .line 115
    .line 116
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 120
    .line 121
    invoke-virtual {v1, v0}, La/m1q0;->d(La/ygp;)Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-eqz v0, :cond_4

    .line 126
    .line 127
    sget-object p0, La/ua20;->e:La/ua20;

    .line 128
    .line 129
    return-object p0

    .line 130
    :cond_4
    const/4 v0, 0x5

    .line 131
    if-ne p1, v0, :cond_5

    .line 132
    .line 133
    sget-object v0, La/ygp;->h1:La/ygp;

    .line 134
    .line 135
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    iget-object v1, p0, La/r9u;->a:La/j1q0;

    .line 139
    .line 140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    iget-object v1, v1, La/j1q0;->a:La/m1q0;

    .line 144
    .line 145
    invoke-virtual {v1, v0}, La/m1q0;->d(La/ygp;)Z

    .line 146
    .line 147
    .line 148
    move-result v0

    .line 149
    if-eqz v0, :cond_5

    .line 150
    .line 151
    sget-object p0, La/ua20;->e:La/ua20;

    .line 152
    .line 153
    return-object p0

    .line 154
    :cond_5
    const/4 v0, 0x6

    .line 155
    if-ne p1, v0, :cond_6

    .line 156
    .line 157
    sget-object p1, La/ygp;->g1:La/ygp;

    .line 158
    .line 159
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    iget-object p0, p0, La/r9u;->a:La/j1q0;

    .line 163
    .line 164
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 168
    .line 169
    invoke-virtual {p0, p1}, La/m1q0;->d(La/ygp;)Z

    .line 170
    .line 171
    .line 172
    move-result p0

    .line 173
    if-eqz p0, :cond_6

    .line 174
    .line 175
    sget-object p0, La/ua20;->e:La/ua20;

    .line 176
    .line 177
    return-object p0

    .line 178
    :cond_6
    sget-object p0, La/ua20;->b:La/ua20;

    .line 179
    .line 180
    return-object p0

    .line 181
    :cond_7
    sget-object p0, La/ua20;->d:La/ua20;

    .line 182
    .line 183
    return-object p0

    .line 184
    :cond_8
    sget-object p0, La/ua20;->c:La/ua20;

    .line 185
    .line 186
    return-object p0
.end method
