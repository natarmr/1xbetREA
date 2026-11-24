.class public final La/yc00;
.super La/cd00;
.source "SourceFile"


# static fields
.field public static final c:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, La/yc00;->c:Ljava/lang/Class;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;JLjava/lang/Object;)V
    .locals 3

    .line 1
    invoke-static {p4, p2, p3}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 8
    .line 9
    .line 10
    move-result p4

    .line 11
    invoke-static {p1, p2, p3}, La/ift0;->j(Ljava/lang/Object;J)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    check-cast v0, Ljava/util/List;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    instance-of v1, v0, La/sez;

    .line 24
    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    new-instance v0, La/oez;

    .line 28
    .line 29
    invoke-direct {v0, p4}, La/oez;-><init>(I)V

    .line 30
    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_0
    instance-of v1, v0, La/sjx;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    instance-of v1, v0, La/amx;

    .line 38
    .line 39
    if-eqz v1, :cond_1

    .line 40
    .line 41
    check-cast v0, La/amx;

    .line 42
    .line 43
    invoke-interface {v0, p4}, La/amx;->n(I)La/amx;

    .line 44
    .line 45
    .line 46
    move-result-object p4

    .line 47
    move-object v0, p4

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-direct {v0, p4}, Ljava/util/ArrayList;-><init>(I)V

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-static {p1, p2, p3, v0}, La/ift0;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_2
    sget-object v1, La/yc00;->c:Ljava/lang/Class;

    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    invoke-virtual {v1, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-eqz v1, :cond_3

    .line 69
    .line 70
    new-instance v1, Ljava/util/ArrayList;

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    add-int/2addr v2, p4

    .line 77
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 81
    .line 82
    .line 83
    invoke-static {p1, p2, p3, v1}, La/ift0;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :goto_1
    move-object v0, v1

    .line 87
    goto :goto_2

    .line 88
    :cond_3
    instance-of v1, v0, La/het0;

    .line 89
    .line 90
    if-eqz v1, :cond_4

    .line 91
    .line 92
    new-instance v1, La/oez;

    .line 93
    .line 94
    check-cast v0, La/het0;

    .line 95
    .line 96
    invoke-virtual {v0}, La/het0;->size()I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    add-int/2addr v2, p4

    .line 101
    invoke-direct {v1, v2}, La/oez;-><init>(I)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1, v0}, La/oez;->addAll(Ljava/util/Collection;)Z

    .line 105
    .line 106
    .line 107
    invoke-static {p1, p2, p3, v1}, La/ift0;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_4
    instance-of v1, v0, La/sjx;

    .line 112
    .line 113
    if-eqz v1, :cond_5

    .line 114
    .line 115
    instance-of v1, v0, La/amx;

    .line 116
    .line 117
    if-eqz v1, :cond_5

    .line 118
    .line 119
    move-object v1, v0

    .line 120
    check-cast v1, La/amx;

    .line 121
    .line 122
    move-object v2, v1

    .line 123
    check-cast v2, La/n4;

    .line 124
    .line 125
    iget-boolean v2, v2, La/n4;->a:Z

    .line 126
    .line 127
    if-nez v2, :cond_5

    .line 128
    .line 129
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    add-int/2addr v0, p4

    .line 134
    invoke-interface {v1, v0}, La/amx;->n(I)La/amx;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    invoke-static {p1, p2, p3, v0}, La/ift0;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :cond_5
    :goto_2
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 142
    .line 143
    .line 144
    move-result p4

    .line 145
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 146
    .line 147
    .line 148
    move-result v1

    .line 149
    if-lez p4, :cond_6

    .line 150
    .line 151
    if-lez v1, :cond_6

    .line 152
    .line 153
    invoke-interface {v0, p0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 154
    .line 155
    .line 156
    :cond_6
    if-lez p4, :cond_7

    .line 157
    .line 158
    move-object p0, v0

    .line 159
    :cond_7
    invoke-static {p1, p2, p3, p0}, La/ift0;->p(Ljava/lang/Object;JLjava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    return-void
.end method
