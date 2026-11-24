.class public final La/z4d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:La/z4d0;


# instance fields
.field public final a:La/bbw0;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/z4d0;

    .line 2
    .line 3
    invoke-direct {v0}, La/z4d0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/z4d0;->c:La/z4d0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/z4d0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, La/bbw0;

    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    invoke-direct {v0, v1}, La/bbw0;-><init>(B)V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, La/z4d0;->a:La/bbw0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)La/o2h0;
    .locals 10

    .line 1
    const-string v0, "messageType"

    .line 2
    .line 3
    invoke-static {p1, v0}, La/cmx;->a(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, La/z4d0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    check-cast v1, La/o2h0;

    .line 13
    .line 14
    if-nez v1, :cond_b

    .line 15
    .line 16
    sget-object v1, La/w2h0;->a:Ljava/lang/Class;

    .line 17
    .line 18
    const-class v1, La/jjt;

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    const/4 v3, 0x0

    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    sget-object v2, La/w2h0;->a:Ljava/lang/Class;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string p0, "Message classes must extend GeneratedMessageV3 or GeneratedMessageLite"

    .line 39
    .line 40
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v3

    .line 44
    :cond_1
    :goto_0
    iget-object p0, p0, La/z4d0;->a:La/bbw0;

    .line 45
    .line 46
    iget-object p0, p0, La/bbw0;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast p0, La/ao20;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, La/ao20;->a(Ljava/lang/Class;)La/x9e0;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget p0, v4, La/x9e0;->d:I

    .line 55
    .line 56
    const/4 v2, 0x2

    .line 57
    and-int/2addr p0, v2

    .line 58
    const/4 v5, 0x1

    .line 59
    if-ne p0, v2, :cond_2

    .line 60
    .line 61
    move p0, v5

    .line 62
    goto :goto_1

    .line 63
    :cond_2
    const/4 p0, 0x0

    .line 64
    :goto_1
    const-string v2, "Protobuf runtime is not correctly loaded."

    .line 65
    .line 66
    if-eqz p0, :cond_5

    .line 67
    .line 68
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_3

    .line 73
    .line 74
    sget-object p0, La/w2h0;->d:La/zdt0;

    .line 75
    .line 76
    sget-object v1, La/yso;->a:La/vso;

    .line 77
    .line 78
    iget-object v2, v4, La/x9e0;->a:La/x3;

    .line 79
    .line 80
    new-instance v3, La/r640;

    .line 81
    .line 82
    invoke-direct {v3, p0, v1, v2}, La/r640;-><init>(La/zdt0;La/vso;La/x3;)V

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    sget-object p0, La/w2h0;->b:La/zdt0;

    .line 87
    .line 88
    sget-object v1, La/yso;->b:La/vso;

    .line 89
    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    iget-object v2, v4, La/x9e0;->a:La/x3;

    .line 93
    .line 94
    new-instance v3, La/r640;

    .line 95
    .line 96
    invoke-direct {v3, p0, v1, v2}, La/r640;-><init>(La/zdt0;La/vso;La/x3;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_4
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    return-object v3

    .line 104
    :cond_5
    invoke-virtual {v1, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    if-eqz p0, :cond_7

    .line 109
    .line 110
    iget p0, v4, La/x9e0;->d:I

    .line 111
    .line 112
    and-int/2addr p0, v5

    .line 113
    if-ne p0, v5, :cond_6

    .line 114
    .line 115
    sget-object v5, La/gm50;->b:La/dm50;

    .line 116
    .line 117
    sget-object v6, La/dd00;->b:La/bd00;

    .line 118
    .line 119
    sget-object v7, La/w2h0;->d:La/zdt0;

    .line 120
    .line 121
    sget-object v8, La/yso;->a:La/vso;

    .line 122
    .line 123
    sget-object v9, La/ap20;->b:La/xo20;

    .line 124
    .line 125
    invoke-static/range {v4 .. v9}, La/o640;->y(La/x9e0;La/dm50;La/dd00;La/zdt0;La/vso;La/xo20;)La/o640;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    goto :goto_2

    .line 130
    :cond_6
    sget-object v5, La/gm50;->b:La/dm50;

    .line 131
    .line 132
    sget-object v6, La/dd00;->b:La/bd00;

    .line 133
    .line 134
    sget-object v7, La/w2h0;->d:La/zdt0;

    .line 135
    .line 136
    const/4 v8, 0x0

    .line 137
    sget-object v9, La/ap20;->b:La/xo20;

    .line 138
    .line 139
    invoke-static/range {v4 .. v9}, La/o640;->y(La/x9e0;La/dm50;La/dd00;La/zdt0;La/vso;La/xo20;)La/o640;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    goto :goto_2

    .line 144
    :cond_7
    iget p0, v4, La/x9e0;->d:I

    .line 145
    .line 146
    and-int/2addr p0, v5

    .line 147
    if-ne p0, v5, :cond_9

    .line 148
    .line 149
    sget-object v5, La/gm50;->a:La/dm50;

    .line 150
    .line 151
    sget-object v6, La/dd00;->a:La/zc00;

    .line 152
    .line 153
    sget-object v7, La/w2h0;->b:La/zdt0;

    .line 154
    .line 155
    sget-object v8, La/yso;->b:La/vso;

    .line 156
    .line 157
    if-eqz v8, :cond_8

    .line 158
    .line 159
    sget-object v9, La/ap20;->a:La/xo20;

    .line 160
    .line 161
    invoke-static/range {v4 .. v9}, La/o640;->y(La/x9e0;La/dm50;La/dd00;La/zdt0;La/vso;La/xo20;)La/o640;

    .line 162
    .line 163
    .line 164
    move-result-object v3

    .line 165
    goto :goto_2

    .line 166
    :cond_8
    invoke-static {v2}, La/jf4;->n(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    return-object v3

    .line 170
    :cond_9
    sget-object v5, La/gm50;->a:La/dm50;

    .line 171
    .line 172
    sget-object v6, La/dd00;->a:La/zc00;

    .line 173
    .line 174
    sget-object v7, La/w2h0;->c:La/zdt0;

    .line 175
    .line 176
    const/4 v8, 0x0

    .line 177
    sget-object v9, La/ap20;->a:La/xo20;

    .line 178
    .line 179
    invoke-static/range {v4 .. v9}, La/o640;->y(La/x9e0;La/dm50;La/dd00;La/zdt0;La/vso;La/xo20;)La/o640;

    .line 180
    .line 181
    .line 182
    move-result-object v3

    .line 183
    :goto_2
    invoke-virtual {v0, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    check-cast p0, La/o2h0;

    .line 188
    .line 189
    if-eqz p0, :cond_a

    .line 190
    .line 191
    return-object p0

    .line 192
    :cond_a
    return-object v3

    .line 193
    :cond_b
    return-object v1
.end method
