.class public final synthetic La/kno;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/util/LinkedHashMap;


# direct methods
.method public synthetic constructor <init>(Ljava/util/LinkedHashMap;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kno;->a:B

    iput-object p1, p0, La/kno;->b:Ljava/util/LinkedHashMap;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/kno;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/kno;->b:Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const/16 v0, 0x2d

    .line 26
    .line 27
    const/16 v1, 0x5f

    .line 28
    .line 29
    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, Ljava/lang/Integer;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    check-cast p1, La/muy;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object v0, p1, La/muy;->a:Ljava/util/List;

    .line 49
    .line 50
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->I(Ljava/lang/Iterable;)La/sx3;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    new-instance v1, La/kno;

    .line 55
    .line 56
    const/4 v2, 0x2

    .line 57
    invoke-direct {v1, p0, v2}, La/kno;-><init>(Ljava/util/LinkedHashMap;B)V

    .line 58
    .line 59
    .line 60
    invoke-static {v0, v1}, La/pgi0;->q(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/c5q;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-static {p0}, La/pgi0;->r(La/c5q;)Ljava/lang/Comparable;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    check-cast p0, Ljava/lang/Integer;

    .line 69
    .line 70
    if-eqz p0, :cond_0

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    new-instance v0, Lkotlin/Pair;

    .line 81
    .line 82
    invoke-direct {v0, p0, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_0
    const/4 v0, 0x0

    .line 87
    :goto_0
    return-object v0

    .line 88
    :pswitch_1
    check-cast p1, La/lno;

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-boolean v0, p1, La/lno;->b:Z

    .line 94
    .line 95
    iget-object p1, p1, La/lno;->a:Ljava/util/Map;

    .line 96
    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, Ljava/lang/Iterable;

    .line 108
    .line 109
    invoke-static {p0, v1}, La/eui0;->f(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    check-cast p0, Ljava/lang/Iterable;

    .line 114
    .line 115
    new-instance v1, Ljava/util/LinkedHashMap;

    .line 116
    .line 117
    const/16 v2, 0xa

    .line 118
    .line 119
    invoke-static {p0, v2}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    invoke-static {v2}, La/wp20;->a(I)I

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    const/16 v3, 0x10

    .line 128
    .line 129
    if-ge v2, v3, :cond_1

    .line 130
    .line 131
    move v2, v3

    .line 132
    :cond_1
    invoke-direct {v1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 133
    .line 134
    .line 135
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 140
    .line 141
    .line 142
    move-result v2

    .line 143
    if-eqz v2, :cond_2

    .line 144
    .line 145
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    move-object v3, v2

    .line 150
    check-cast v3, Ljava/lang/Number;

    .line 151
    .line 152
    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    .line 153
    .line 154
    .line 155
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 156
    .line 157
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_2
    invoke-static {p1, v1}, La/xp20;->j(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    new-instance p1, La/lno;

    .line 166
    .line 167
    invoke-direct {p1, p0, v0}, La/lno;-><init>(Ljava/util/Map;Z)V

    .line 168
    .line 169
    .line 170
    goto :goto_2

    .line 171
    :cond_3
    new-instance p1, La/lno;

    .line 172
    .line 173
    invoke-direct {p1, p0, v0}, La/lno;-><init>(Ljava/util/Map;Z)V

    .line 174
    .line 175
    .line 176
    :goto_2
    return-object p1

    .line 177
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
