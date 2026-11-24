.class public final La/tva;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sv40;


# static fields
.field public static final a:La/tva;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/tva;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/tva;->a:La/tva;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 4

    .line 1
    move-object p0, p2

    .line 2
    check-cast p0, Ljava/util/ArrayList;

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    new-instance p0, La/d69;

    .line 12
    .line 13
    const/16 p2, 0x1c

    .line 14
    .line 15
    invoke-direct {p0, p2}, La/d69;-><init>(B)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v1, v1, p0}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_0
    sget v0, La/uva;->a:F

    .line 24
    .line 25
    invoke-interface {p1, v0}, La/w6k;->T(F)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    new-instance v2, Ljava/util/ArrayList;

    .line 30
    .line 31
    const/16 v3, 0xa

    .line 32
    .line 33
    invoke-static {p2, v3}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-direct {v2, p2}, Ljava/util/ArrayList;-><init>(I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result p2

    .line 48
    if-eqz p2, :cond_1

    .line 49
    .line 50
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    check-cast p2, Ljava/util/List;

    .line 55
    .line 56
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    check-cast p2, La/pj30;

    .line 61
    .line 62
    invoke-interface {p2, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-virtual {v2, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->U(Ljava/util/List;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, La/pu90;

    .line 75
    .line 76
    iget p0, p0, La/pu90;->a:I

    .line 77
    .line 78
    const/4 p2, 0x1

    .line 79
    invoke-static {v2, p2}, Lkotlin/collections/CollectionsKt;->O(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object p2

    .line 87
    move p3, v1

    .line 88
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result p4

    .line 92
    if-eqz p4, :cond_3

    .line 93
    .line 94
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p4

    .line 98
    check-cast p4, La/pu90;

    .line 99
    .line 100
    iget p4, p4, La/pu90;->a:I

    .line 101
    .line 102
    sub-int/2addr p4, v0

    .line 103
    if-gez p4, :cond_2

    .line 104
    .line 105
    move p4, v1

    .line 106
    :cond_2
    add-int/2addr p3, p4

    .line 107
    goto :goto_1

    .line 108
    :cond_3
    add-int/2addr p0, p3

    .line 109
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result p3

    .line 117
    if-eqz p3, :cond_6

    .line 118
    .line 119
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p3

    .line 123
    check-cast p3, La/pu90;

    .line 124
    .line 125
    iget p3, p3, La/pu90;->b:I

    .line 126
    .line 127
    :cond_4
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result p4

    .line 131
    if-eqz p4, :cond_5

    .line 132
    .line 133
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object p4

    .line 137
    check-cast p4, La/pu90;

    .line 138
    .line 139
    iget p4, p4, La/pu90;->b:I

    .line 140
    .line 141
    if-ge p3, p4, :cond_4

    .line 142
    .line 143
    move p3, p4

    .line 144
    goto :goto_2

    .line 145
    :cond_5
    new-instance p2, La/sva;

    .line 146
    .line 147
    invoke-direct {p2, v1, p3, v0, v2}, La/sva;-><init>(BIILjava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-static {p1, p0, p3, p2}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    return-object p0

    .line 155
    :cond_6
    invoke-static {}, La/itt0;->a()V

    .line 156
    .line 157
    .line 158
    const/4 p0, 0x0

    .line 159
    return-object p0
.end method
