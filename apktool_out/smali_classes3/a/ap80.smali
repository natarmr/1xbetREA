.class public final La/ap80;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Ljava/util/List;


# instance fields
.field public final a:La/uzc;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    sget-object v0, La/l700;->a:La/l700;

    .line 2
    .line 3
    sget-object v1, La/l700;->b:La/l700;

    .line 4
    .line 5
    sget-object v2, La/l700;->c:La/l700;

    .line 6
    .line 7
    filled-new-array {v0, v1, v2}, [La/l700;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, La/ap80;->b:Ljava/util/List;

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(La/uzc;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ap80;->a:La/uzc;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a(JZZJZLjava/lang/String;)Ljava/util/Map;
    .locals 1

    .line 1
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    new-instance p2, Lkotlin/Pair;

    .line 9
    .line 10
    const-string v0, "id"

    .line 11
    .line 12
    invoke-direct {p2, v0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    invoke-static {p2}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    sget-object p2, La/rxs0;->a:[La/rxs0;

    .line 20
    .line 21
    sget-object p2, La/l700;->a:La/l700;

    .line 22
    .line 23
    sget-object p2, La/xun;->a:La/xun;

    .line 24
    .line 25
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    if-eqz p4, :cond_0

    .line 29
    .line 30
    const-wide/16 p2, 0x0

    .line 31
    .line 32
    cmp-long p2, p5, p2

    .line 33
    .line 34
    if-lez p2, :cond_0

    .line 35
    .line 36
    invoke-static {p5, p6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    new-instance p3, Lkotlin/Pair;

    .line 41
    .line 42
    const-string p4, "userId"

    .line 43
    .line 44
    invoke-direct {p3, p4, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p3}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    sget-object p2, La/lun;->a:La/lun;

    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    :goto_0
    sget-object p3, La/lun;->a:La/lun;

    .line 58
    .line 59
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-static {p2, p3}, La/xp20;->j(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    iget-object p0, p0, La/ap80;->a:La/uzc;

    .line 67
    .line 68
    invoke-virtual {p0}, La/uzc;->b()La/jvn;

    .line 69
    .line 70
    .line 71
    move-result-object p4

    .line 72
    sget-object p5, La/jvn;->d:La/jvn;

    .line 73
    .line 74
    if-eq p4, p5, :cond_1

    .line 75
    .line 76
    invoke-virtual {p0}, La/uzc;->b()La/jvn;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0}, La/jvn;->getId()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    new-instance p4, Lkotlin/Pair;

    .line 89
    .line 90
    const-string p5, "cfview"

    .line 91
    .line 92
    invoke-direct {p4, p5, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    invoke-static {p4}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    goto :goto_1

    .line 100
    :cond_1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-object p0, p3

    .line 104
    :goto_1
    invoke-static {p2, p0}, La/xp20;->j(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    if-nez p7, :cond_2

    .line 109
    .line 110
    new-instance p2, Lkotlin/Pair;

    .line 111
    .line 112
    const-string p3, "lng"

    .line 113
    .line 114
    invoke-direct {p2, p3, p8}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 115
    .line 116
    .line 117
    invoke-static {p2}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 118
    .line 119
    .line 120
    move-result-object p3

    .line 121
    goto :goto_2

    .line 122
    :cond_2
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    :goto_2
    invoke-static {p0, p3}, La/xp20;->j(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 126
    .line 127
    .line 128
    move-result-object p0

    .line 129
    const/4 p2, 0x2

    .line 130
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    new-instance p3, Lkotlin/Pair;

    .line 135
    .line 136
    const-string p4, "grMode"

    .line 137
    .line 138
    invoke-direct {p3, p4, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    invoke-static {p3}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 142
    .line 143
    .line 144
    move-result-object p2

    .line 145
    invoke-static {p0, p2}, La/xp20;->j(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 150
    .line 151
    new-instance p3, Lkotlin/Pair;

    .line 152
    .line 153
    const-string p4, "groupEvents"

    .line 154
    .line 155
    invoke-direct {p3, p4, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 156
    .line 157
    .line 158
    invoke-static {p3}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    invoke-static {p0, p2}, La/xp20;->j(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    const/16 p2, 0x54d

    .line 167
    .line 168
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 169
    .line 170
    .line 171
    move-result-object p2

    .line 172
    new-instance p3, Lkotlin/Pair;

    .line 173
    .line 174
    const-string p4, "gr"

    .line 175
    .line 176
    invoke-direct {p3, p4, p2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    invoke-static {p3}, La/wp20;->b(Lkotlin/Pair;)Ljava/util/Map;

    .line 180
    .line 181
    .line 182
    move-result-object p2

    .line 183
    invoke-static {p0, p2}, La/xp20;->j(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 184
    .line 185
    .line 186
    move-result-object p0

    .line 187
    invoke-static {p1, p0}, La/xp20;->j(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 188
    .line 189
    .line 190
    move-result-object p0

    .line 191
    return-object p0
.end method
