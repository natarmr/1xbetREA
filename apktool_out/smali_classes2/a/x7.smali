.class public final synthetic La/x7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/r040;


# direct methods
.method public synthetic constructor <init>(La/r040;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x7;->a:B

    iput-object p1, p0, La/x7;->b:La/r040;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/x7;->a:B

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    const/4 v2, 0x0

    .line 5
    const v3, 0x7f08096d

    .line 6
    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, Ljava/lang/Integer;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    rem-int/lit8 p1, p1, 0x2

    .line 18
    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    sget-object p0, La/iun;->a:La/iun;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move v0, v1

    .line 25
    sget-object v1, La/iz30;->b:La/iz30;

    .line 26
    .line 27
    new-instance v4, La/c0m;

    .line 28
    .line 29
    new-instance v7, La/m0x;

    .line 30
    .line 31
    invoke-direct {v7, v3, v2, v0}, La/m0x;-><init>(ILa/bzw;I)V

    .line 32
    .line 33
    .line 34
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 35
    .line 36
    sget-object p1, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 37
    .line 38
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 39
    .line 40
    .line 41
    move-result-wide v8

    .line 42
    new-instance v5, La/j0m;

    .line 43
    .line 44
    const/4 v11, 0x0

    .line 45
    const/16 v12, 0x22

    .line 46
    .line 47
    const-string v6, ""

    .line 48
    .line 49
    const v10, 0x7f08096d

    .line 50
    .line 51
    .line 52
    invoke-direct/range {v5 .. v12}, La/j0m;-><init>(Ljava/lang/String;La/o0x;JILa/i0m;I)V

    .line 53
    .line 54
    .line 55
    const/4 v9, 0x0

    .line 56
    const/16 v10, 0x3e

    .line 57
    .line 58
    const/4 v6, 0x0

    .line 59
    const/4 v7, 0x0

    .line 60
    const/4 v8, 0x0

    .line 61
    invoke-direct/range {v4 .. v10}, La/c0m;-><init>(La/j0m;La/b0m;La/f0m;ZLa/xzl;I)V

    .line 62
    .line 63
    .line 64
    new-instance v0, La/jy30;

    .line 65
    .line 66
    move-object v6, v4

    .line 67
    new-instance v4, La/ry30;

    .line 68
    .line 69
    invoke-direct {v4, v1}, La/ry30;-><init>(La/iz30;)V

    .line 70
    .line 71
    .line 72
    const/4 v5, 0x0

    .line 73
    iget-object v2, p0, La/x7;->b:La/r040;

    .line 74
    .line 75
    const/4 v3, 0x0

    .line 76
    invoke-direct/range {v0 .. v6}, La/jy30;-><init>(La/iz30;La/r040;ZLa/wy30;La/qy30;La/c0m;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    :goto_0
    return-object p0

    .line 84
    :pswitch_0
    move v0, v1

    .line 85
    check-cast p1, Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    rem-int/lit8 p1, p1, 0x2

    .line 92
    .line 93
    if-nez p1, :cond_1

    .line 94
    .line 95
    sget-object p0, La/iun;->a:La/iun;

    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_1
    sget-object v1, La/iz30;->b:La/iz30;

    .line 99
    .line 100
    new-instance v4, La/c0m;

    .line 101
    .line 102
    new-instance v7, La/m0x;

    .line 103
    .line 104
    invoke-direct {v7, v3, v2, v0}, La/m0x;-><init>(ILa/bzw;I)V

    .line 105
    .line 106
    .line 107
    sget-object p1, La/s6t0;->a:La/pz40;

    .line 108
    .line 109
    sget-object p1, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 110
    .line 111
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 112
    .line 113
    .line 114
    move-result-wide v8

    .line 115
    new-instance v5, La/j0m;

    .line 116
    .line 117
    const/4 v11, 0x0

    .line 118
    const/16 v12, 0x22

    .line 119
    .line 120
    const-string v6, ""

    .line 121
    .line 122
    const v10, 0x7f08096d

    .line 123
    .line 124
    .line 125
    invoke-direct/range {v5 .. v12}, La/j0m;-><init>(Ljava/lang/String;La/o0x;JILa/i0m;I)V

    .line 126
    .line 127
    .line 128
    sget-object p1, La/r040;->m:La/r040;

    .line 129
    .line 130
    iget-object v2, p0, La/x7;->b:La/r040;

    .line 131
    .line 132
    if-eq v2, p1, :cond_3

    .line 133
    .line 134
    sget-object p0, La/r040;->n:La/r040;

    .line 135
    .line 136
    if-ne v2, p0, :cond_2

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_2
    new-instance p0, La/a0m;

    .line 140
    .line 141
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    iget-object p1, p1, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 146
    .line 147
    invoke-virtual {p1}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getTextPrimary-0d7_KjU()J

    .line 148
    .line 149
    .line 150
    move-result-wide v6

    .line 151
    const-string p1, ""

    .line 152
    .line 153
    invoke-direct {p0, p1, v6, v7}, La/a0m;-><init>(Ljava/lang/String;J)V

    .line 154
    .line 155
    .line 156
    :goto_1
    move-object v6, p0

    .line 157
    goto :goto_3

    .line 158
    :cond_3
    :goto_2
    sget-object p0, La/yzl;->a:La/yzl;

    .line 159
    .line 160
    goto :goto_1

    .line 161
    :goto_3
    const/4 v9, 0x0

    .line 162
    const/16 v10, 0x3c

    .line 163
    .line 164
    const/4 v7, 0x0

    .line 165
    const/4 v8, 0x0

    .line 166
    invoke-direct/range {v4 .. v10}, La/c0m;-><init>(La/j0m;La/b0m;La/f0m;ZLa/xzl;I)V

    .line 167
    .line 168
    .line 169
    new-instance v0, La/jy30;

    .line 170
    .line 171
    move-object v6, v4

    .line 172
    new-instance v4, La/ry30;

    .line 173
    .line 174
    invoke-direct {v4, v1}, La/ry30;-><init>(La/iz30;)V

    .line 175
    .line 176
    .line 177
    const/4 v5, 0x0

    .line 178
    const/4 v3, 0x0

    .line 179
    invoke-direct/range {v0 .. v6}, La/jy30;-><init>(La/iz30;La/r040;ZLa/wy30;La/qy30;La/c0m;)V

    .line 180
    .line 181
    .line 182
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    :goto_4
    return-object p0

    .line 187
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
