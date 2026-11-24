.class public final La/b5d0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:La/b5d0;


# instance fields
.field public final a:La/do20;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/b5d0;

    .line 2
    .line 3
    invoke-direct {v0}, La/b5d0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/b5d0;->c:La/b5d0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 6

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
    iput-object v0, p0, La/b5d0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, La/do20;

    .line 12
    .line 13
    new-instance v1, La/bo20;

    .line 14
    .line 15
    :try_start_0
    const-string v2, "com.google.protobuf.DescriptorMessageInfoFactory"

    .line 16
    .line 17
    invoke-static {v2}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const-string v3, "getInstance"

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2, v4, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    check-cast v2, La/y440;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :catch_0
    sget-object v2, La/do20;->b:La/wit;

    .line 36
    .line 37
    :goto_0
    const/4 v3, 0x2

    .line 38
    new-array v3, v3, [La/y440;

    .line 39
    .line 40
    sget-object v4, La/wit;->b:La/wit;

    .line 41
    .line 42
    const/4 v5, 0x0

    .line 43
    aput-object v4, v3, v5

    .line 44
    .line 45
    const/4 v4, 0x1

    .line 46
    aput-object v2, v3, v4

    .line 47
    .line 48
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object v3, v1, La/bo20;->a:[La/y440;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    sget-object v2, La/dmx;->a:Ljava/nio/charset/Charset;

    .line 57
    .line 58
    iput-object v1, v0, La/do20;->a:Ljava/lang/Object;

    .line 59
    .line 60
    iput-object v0, p0, La/b5d0;->a:La/do20;

    .line 61
    .line 62
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Class;)La/p2h0;
    .locals 9

    .line 1
    sget-object v0, La/dmx;->a:Ljava/nio/charset/Charset;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p1, :cond_c

    .line 5
    .line 6
    iget-object v1, p0, La/b5d0;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, La/p2h0;

    .line 13
    .line 14
    if-nez v2, :cond_b

    .line 15
    .line 16
    sget-object v2, La/x2h0;->a:Ljava/lang/Class;

    .line 17
    .line 18
    const-class v2, La/kjt;

    .line 19
    .line 20
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    sget-object v3, La/x2h0;->a:Ljava/lang/Class;

    .line 27
    .line 28
    if-eqz v3, :cond_1

    .line 29
    .line 30
    invoke-virtual {v3, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_0

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string p0, "Message classes must extend GeneratedMessageV3 or GeneratedMessageLite"

    .line 38
    .line 39
    invoke-static {p0}, La/jf4;->o(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    return-object v0

    .line 43
    :cond_1
    :goto_0
    iget-object p0, p0, La/b5d0;->a:La/do20;

    .line 44
    .line 45
    iget-object p0, p0, La/do20;->a:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p0, La/bo20;

    .line 48
    .line 49
    invoke-virtual {p0, p1}, La/bo20;->a(Ljava/lang/Class;)La/y9e0;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    iget p0, v3, La/y9e0;->d:I

    .line 54
    .line 55
    const/4 v4, 0x2

    .line 56
    and-int/2addr p0, v4

    .line 57
    const/4 v5, 0x1

    .line 58
    if-ne p0, v4, :cond_2

    .line 59
    .line 60
    move p0, v5

    .line 61
    goto :goto_1

    .line 62
    :cond_2
    const/4 p0, 0x0

    .line 63
    :goto_1
    const-string v4, "Protobuf runtime is not correctly loaded."

    .line 64
    .line 65
    if-eqz p0, :cond_5

    .line 66
    .line 67
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    if-eqz p0, :cond_3

    .line 72
    .line 73
    sget-object p0, La/x2h0;->c:La/aet0;

    .line 74
    .line 75
    sget-object v0, La/zso;->a:La/wso;

    .line 76
    .line 77
    iget-object v2, v3, La/y9e0;->a:La/y3;

    .line 78
    .line 79
    new-instance v3, La/s640;

    .line 80
    .line 81
    invoke-direct {v3, p0, v0, v2}, La/s640;-><init>(La/aet0;La/wso;La/y3;)V

    .line 82
    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    sget-object p0, La/x2h0;->b:La/aet0;

    .line 86
    .line 87
    sget-object v2, La/zso;->b:La/wso;

    .line 88
    .line 89
    if-eqz v2, :cond_4

    .line 90
    .line 91
    iget-object v0, v3, La/y9e0;->a:La/y3;

    .line 92
    .line 93
    new-instance v3, La/s640;

    .line 94
    .line 95
    invoke-direct {v3, p0, v2, v0}, La/s640;-><init>(La/aet0;La/wso;La/y3;)V

    .line 96
    .line 97
    .line 98
    goto :goto_2

    .line 99
    :cond_4
    invoke-static {v4}, La/jf4;->n(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    return-object v0

    .line 103
    :cond_5
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    if-eqz p0, :cond_7

    .line 108
    .line 109
    invoke-virtual {v3}, La/y9e0;->a()I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    invoke-static {p0}, La/hne;->E(I)I

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    if-eq p0, v5, :cond_6

    .line 118
    .line 119
    sget-object v4, La/hm50;->b:La/em50;

    .line 120
    .line 121
    sget-object v5, La/cd00;->b:La/ad00;

    .line 122
    .line 123
    sget-object v6, La/x2h0;->c:La/aet0;

    .line 124
    .line 125
    sget-object v7, La/zso;->a:La/wso;

    .line 126
    .line 127
    sget-object v8, La/bp20;->b:La/yo20;

    .line 128
    .line 129
    invoke-static/range {v3 .. v8}, La/p640;->q(La/y9e0;La/em50;La/cd00;La/aet0;La/wso;La/yo20;)La/p640;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    goto :goto_2

    .line 134
    :cond_6
    sget-object v4, La/hm50;->b:La/em50;

    .line 135
    .line 136
    sget-object v5, La/cd00;->b:La/ad00;

    .line 137
    .line 138
    sget-object v6, La/x2h0;->c:La/aet0;

    .line 139
    .line 140
    const/4 v7, 0x0

    .line 141
    sget-object v8, La/bp20;->b:La/yo20;

    .line 142
    .line 143
    invoke-static/range {v3 .. v8}, La/p640;->q(La/y9e0;La/em50;La/cd00;La/aet0;La/wso;La/yo20;)La/p640;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    goto :goto_2

    .line 148
    :cond_7
    invoke-virtual {v3}, La/y9e0;->a()I

    .line 149
    .line 150
    .line 151
    move-result p0

    .line 152
    invoke-static {p0}, La/hne;->E(I)I

    .line 153
    .line 154
    .line 155
    move-result p0

    .line 156
    if-eq p0, v5, :cond_9

    .line 157
    .line 158
    move-object p0, v4

    .line 159
    sget-object v4, La/hm50;->a:La/em50;

    .line 160
    .line 161
    sget-object v5, La/cd00;->a:La/yc00;

    .line 162
    .line 163
    sget-object v6, La/x2h0;->b:La/aet0;

    .line 164
    .line 165
    sget-object v7, La/zso;->b:La/wso;

    .line 166
    .line 167
    if-eqz v7, :cond_8

    .line 168
    .line 169
    sget-object v8, La/bp20;->a:La/yo20;

    .line 170
    .line 171
    invoke-static/range {v3 .. v8}, La/p640;->q(La/y9e0;La/em50;La/cd00;La/aet0;La/wso;La/yo20;)La/p640;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    goto :goto_2

    .line 176
    :cond_8
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    return-object v0

    .line 180
    :cond_9
    sget-object v4, La/hm50;->a:La/em50;

    .line 181
    .line 182
    sget-object v5, La/cd00;->a:La/yc00;

    .line 183
    .line 184
    sget-object v6, La/x2h0;->b:La/aet0;

    .line 185
    .line 186
    const/4 v7, 0x0

    .line 187
    sget-object v8, La/bp20;->a:La/yo20;

    .line 188
    .line 189
    invoke-static/range {v3 .. v8}, La/p640;->q(La/y9e0;La/em50;La/cd00;La/aet0;La/wso;La/yo20;)La/p640;

    .line 190
    .line 191
    .line 192
    move-result-object v3

    .line 193
    :goto_2
    invoke-virtual {v1, p1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p0

    .line 197
    check-cast p0, La/p2h0;

    .line 198
    .line 199
    if-eqz p0, :cond_a

    .line 200
    .line 201
    return-object p0

    .line 202
    :cond_a
    return-object v3

    .line 203
    :cond_b
    return-object v2

    .line 204
    :cond_c
    const-string p0, "messageType"

    .line 205
    .line 206
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 207
    .line 208
    .line 209
    return-object v0
.end method
