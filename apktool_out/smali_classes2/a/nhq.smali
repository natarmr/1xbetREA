.class public final La/nhq;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/nhq;

.field public static final b:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/nhq;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/nhq;->a:La/nhq;

    .line 7
    .line 8
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, La/nhq;->b:Ljava/util/Map;

    .line 18
    .line 19
    return-void
.end method

.method public static a(La/jki0;)La/lhq;
    .locals 2

    .line 1
    sget-object v0, La/nhq;->b:Ljava/util/Map;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    check-cast v0, La/lhq;

    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const-string v0, "Cannot get dependency "

    .line 16
    .line 17
    const-string v1, ". Dependencies should be added at class load time."

    .line 18
    .line 19
    invoke-static {p0, v1, v0}, La/udk;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method


# virtual methods
.method public final b(La/zje;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p1, La/mhq;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/mhq;

    .line 7
    .line 8
    iget v1, v0, La/mhq;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/mhq;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/mhq;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/mhq;-><init>(La/nhq;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, La/mhq;->n:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/mhq;->p:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v3, :cond_1

    .line 36
    .line 37
    iget-object v1, v0, La/mhq;->m:Ljava/lang/Object;

    .line 38
    .line 39
    iget-object v4, v0, La/mhq;->l:Ljava/util/Map;

    .line 40
    .line 41
    check-cast v4, Ljava/util/Map;

    .line 42
    .line 43
    iget-object v5, v0, La/mhq;->k:La/jki0;

    .line 44
    .line 45
    iget-object v6, v0, La/mhq;->j:Ljava/util/Iterator;

    .line 46
    .line 47
    iget-object v7, v0, La/mhq;->i:Ljava/util/Map;

    .line 48
    .line 49
    check-cast v7, Ljava/util/Map;

    .line 50
    .line 51
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 56
    .line 57
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    return-object v2

    .line 61
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    sget-object p0, La/nhq;->b:Ljava/util/Map;

    .line 65
    .line 66
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 70
    .line 71
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    invoke-static {v4}, La/wp20;->a(I)I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    invoke-direct {v1, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 80
    .line 81
    .line 82
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    check-cast p0, Ljava/lang/Iterable;

    .line 87
    .line 88
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    move-object v6, p0

    .line 93
    move-object v4, v1

    .line 94
    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-eqz p0, :cond_5

    .line 99
    .line 100
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    check-cast p0, Ljava/util/Map$Entry;

    .line 105
    .line 106
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    check-cast v5, La/jki0;

    .line 115
    .line 116
    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    check-cast p0, La/lhq;

    .line 121
    .line 122
    new-instance v7, La/yip;

    .line 123
    .line 124
    const/16 v8, 0xb

    .line 125
    .line 126
    invoke-direct {v7, p0, v8}, La/yip;-><init>(Ljava/lang/Object;B)V

    .line 127
    .line 128
    .line 129
    move-object p0, v4

    .line 130
    check-cast p0, Ljava/util/Map;

    .line 131
    .line 132
    iput-object p0, v0, La/mhq;->i:Ljava/util/Map;

    .line 133
    .line 134
    iput-object v6, v0, La/mhq;->j:Ljava/util/Iterator;

    .line 135
    .line 136
    iput-object v5, v0, La/mhq;->k:La/jki0;

    .line 137
    .line 138
    iput-object p0, v0, La/mhq;->l:Ljava/util/Map;

    .line 139
    .line 140
    iput-object v1, v0, La/mhq;->m:Ljava/lang/Object;

    .line 141
    .line 142
    iput v3, v0, La/mhq;->p:I

    .line 143
    .line 144
    sget-object p0, Lkotlin/coroutines/g;->a:Lkotlin/coroutines/g;

    .line 145
    .line 146
    new-instance v8, La/kaw;

    .line 147
    .line 148
    const/16 v9, 0x9

    .line 149
    .line 150
    invoke-direct {v8, v7, v2, v9}, La/kaw;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 151
    .line 152
    .line 153
    invoke-static {p0, v8, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    if-ne p0, p1, :cond_3

    .line 158
    .line 159
    return-object p1

    .line 160
    :cond_3
    move-object v7, v4

    .line 161
    :goto_2
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    invoke-static {v5}, La/nhq;->a(La/jki0;)La/lhq;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    iget-object p0, p0, La/lhq;->b:La/a8f;

    .line 169
    .line 170
    if-eqz p0, :cond_4

    .line 171
    .line 172
    invoke-interface {v4, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-object v4, v7

    .line 176
    goto :goto_1

    .line 177
    :cond_4
    const-string p0, "Subscriber "

    .line 178
    .line 179
    const-string p1, " has not been registered."

    .line 180
    .line 181
    invoke-static {v5, p1, p0}, La/udk;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    return-object v2

    .line 185
    :cond_5
    return-object v4
.end method
