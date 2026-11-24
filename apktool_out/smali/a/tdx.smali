.class public final La/tdx;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:La/xlw;

.field public final c:La/xlw;

.field public final d:La/xlw;

.field public final e:La/xlw;

.field public final f:Ljava/io/Serializable;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 3

    const/4 v0, 0x1

    iput-byte v0, p0, La/tdx;->a:B

    .line 155
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/tdx;->f:Ljava/io/Serializable;

    .line 156
    new-instance p1, La/xlw;

    const/4 v1, 0x0

    .line 157
    invoke-direct {p1, v1, v0}, La/xlw;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 158
    iput-object p1, p0, La/tdx;->b:La/xlw;

    .line 159
    new-instance p1, La/xlw;

    const/4 v2, 0x0

    .line 160
    invoke-direct {p1, v1, v2}, La/xlw;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 161
    iput-object p1, p0, La/tdx;->c:La/xlw;

    .line 162
    new-instance p1, La/xlw;

    .line 163
    invoke-direct {p1, v1, v0}, La/xlw;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 164
    iput-object p1, p0, La/tdx;->d:La/xlw;

    .line 165
    new-instance p1, La/xlw;

    .line 166
    invoke-direct {p1, v1, v2}, La/xlw;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 167
    iput-object p1, p0, La/tdx;->e:La/xlw;

    return-void
.end method

.method public constructor <init>([La/tdx;)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/tdx;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/tdx;->f:Ljava/io/Serializable;

    .line 8
    .line 9
    array-length p1, p1

    .line 10
    new-array v1, p1, [La/xlw;

    .line 11
    .line 12
    move v2, v0

    .line 13
    :goto_0
    if-ge v2, p1, :cond_0

    .line 14
    .line 15
    iget-object v3, p0, La/tdx;->f:Ljava/io/Serializable;

    .line 16
    .line 17
    check-cast v3, [La/tdx;

    .line 18
    .line 19
    aget-object v3, v3, v2

    .line 20
    .line 21
    invoke-virtual {v3}, La/tdx;->b()La/xlw;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    aput-object v3, v1, v2

    .line 26
    .line 27
    add-int/lit8 v2, v2, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    new-instance p1, La/kcu0;

    .line 31
    .line 32
    const/4 v2, 0x1

    .line 33
    invoke-direct {p1, v1, v2}, La/kcu0;-><init>([La/xlw;B)V

    .line 34
    .line 35
    .line 36
    new-instance v1, La/xlw;

    .line 37
    .line 38
    invoke-direct {v1, p1, v2}, La/xlw;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, La/tdx;->b:La/xlw;

    .line 42
    .line 43
    iget-object p1, p0, La/tdx;->f:Ljava/io/Serializable;

    .line 44
    .line 45
    check-cast p1, [La/tdx;

    .line 46
    .line 47
    array-length p1, p1

    .line 48
    new-array v1, p1, [La/xlw;

    .line 49
    .line 50
    move v3, v0

    .line 51
    :goto_1
    if-ge v3, p1, :cond_1

    .line 52
    .line 53
    iget-object v4, p0, La/tdx;->f:Ljava/io/Serializable;

    .line 54
    .line 55
    check-cast v4, [La/tdx;

    .line 56
    .line 57
    aget-object v4, v4, v3

    .line 58
    .line 59
    invoke-virtual {v4}, La/tdx;->d()La/xlw;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    aput-object v4, v1, v3

    .line 64
    .line 65
    add-int/lit8 v3, v3, 0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    new-instance p1, La/xlw;

    .line 69
    .line 70
    new-instance v3, La/wlw;

    .line 71
    .line 72
    invoke-direct {v3, v1, v2}, La/wlw;-><init>([La/xlw;B)V

    .line 73
    .line 74
    .line 75
    invoke-direct {p1, v3, v0}, La/xlw;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 76
    .line 77
    .line 78
    iput-object p1, p0, La/tdx;->c:La/xlw;

    .line 79
    .line 80
    iget-object p1, p0, La/tdx;->f:Ljava/io/Serializable;

    .line 81
    .line 82
    check-cast p1, [La/tdx;

    .line 83
    .line 84
    array-length p1, p1

    .line 85
    new-array v1, p1, [La/xlw;

    .line 86
    .line 87
    move v3, v0

    .line 88
    :goto_2
    if-ge v3, p1, :cond_2

    .line 89
    .line 90
    iget-object v4, p0, La/tdx;->f:Ljava/io/Serializable;

    .line 91
    .line 92
    check-cast v4, [La/tdx;

    .line 93
    .line 94
    aget-object v4, v4, v3

    .line 95
    .line 96
    invoke-virtual {v4}, La/tdx;->c()La/xlw;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    aput-object v4, v1, v3

    .line 101
    .line 102
    add-int/lit8 v3, v3, 0x1

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_2
    new-instance p1, La/kcu0;

    .line 106
    .line 107
    invoke-direct {p1, v1, v0}, La/kcu0;-><init>([La/xlw;B)V

    .line 108
    .line 109
    .line 110
    new-instance v1, La/xlw;

    .line 111
    .line 112
    invoke-direct {v1, p1, v2}, La/xlw;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 113
    .line 114
    .line 115
    iput-object v1, p0, La/tdx;->d:La/xlw;

    .line 116
    .line 117
    iget-object p1, p0, La/tdx;->f:Ljava/io/Serializable;

    .line 118
    .line 119
    check-cast p1, [La/tdx;

    .line 120
    .line 121
    array-length p1, p1

    .line 122
    new-array v1, p1, [La/xlw;

    .line 123
    .line 124
    move v2, v0

    .line 125
    :goto_3
    if-ge v2, p1, :cond_3

    .line 126
    .line 127
    iget-object v3, p0, La/tdx;->f:Ljava/io/Serializable;

    .line 128
    .line 129
    check-cast v3, [La/tdx;

    .line 130
    .line 131
    aget-object v3, v3, v2

    .line 132
    .line 133
    invoke-virtual {v3}, La/tdx;->a()La/xlw;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    aput-object v3, v1, v2

    .line 138
    .line 139
    add-int/lit8 v2, v2, 0x1

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_3
    new-instance p1, La/xlw;

    .line 143
    .line 144
    new-instance v2, La/wlw;

    .line 145
    .line 146
    invoke-direct {v2, v1, v0}, La/wlw;-><init>([La/xlw;B)V

    .line 147
    .line 148
    .line 149
    invoke-direct {p1, v2, v0}, La/xlw;-><init>(Lkotlin/jvm/functions/Function2;B)V

    .line 150
    .line 151
    .line 152
    iput-object p1, p0, La/tdx;->e:La/xlw;

    .line 153
    .line 154
    return-void
.end method


# virtual methods
.method public final a()La/xlw;
    .locals 1

    .line 1
    iget-byte v0, p0, La/tdx;->a:B

    iget-object p0, p0, La/tdx;->e:La/xlw;

    return-object p0
.end method

.method public final b()La/xlw;
    .locals 1

    .line 1
    iget-byte v0, p0, La/tdx;->a:B

    iget-object p0, p0, La/tdx;->b:La/xlw;

    return-object p0
.end method

.method public final c()La/xlw;
    .locals 1

    .line 1
    iget-byte v0, p0, La/tdx;->a:B

    iget-object p0, p0, La/tdx;->d:La/xlw;

    return-object p0
.end method

.method public final d()La/xlw;
    .locals 1

    .line 1
    iget-byte v0, p0, La/tdx;->a:B

    iget-object p0, p0, La/tdx;->c:La/xlw;

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-byte v0, p0, La/tdx;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/tdx;->f:Ljava/io/Serializable;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Ljava/lang/String;

    .line 9
    .line 10
    const-string v0, "RectRulers("

    .line 11
    .line 12
    const-string v1, ")"

    .line 13
    .line 14
    invoke-static {v0, p0, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    move-object v0, p0

    .line 20
    check-cast v0, [La/tdx;

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    const/16 v5, 0x39

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    const-string v2, "innermostOf("

    .line 27
    .line 28
    const-string v3, ")"

    .line 29
    .line 30
    invoke-static/range {v0 .. v5}, La/tx3;->N([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
