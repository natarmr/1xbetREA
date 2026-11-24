.class public final La/n3b;
.super La/q4;
.source "SourceFile"


# static fields
.field public static final h:La/ek5;


# instance fields
.field public final f:La/ntl;

.field public g:Lkotlin/jvm/functions/Function1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/ek5;

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/ek5;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/n3b;->h:La/ek5;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(La/ntl;)V
    .locals 1

    .line 1
    sget-object v0, La/n3b;->h:La/ek5;

    .line 2
    .line 3
    invoke-direct {p0, v0}, La/q4;-><init>(La/dtb;)V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, La/n3b;->f:La/ntl;

    .line 7
    .line 8
    const/4 p1, 0x0

    .line 9
    iput-object p1, p0, La/n3b;->g:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final f(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/q4;->A(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/z3b;

    .line 6
    .line 7
    invoke-interface {p0}, La/z3b;->a()La/n3d;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method

.method public final n(La/xhe0;I)V
    .locals 3

    .line 1
    invoke-virtual {p0, p2}, La/q4;->A(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/z3b;

    .line 6
    .line 7
    invoke-interface {v0}, La/z3b;->a()La/n3d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    const/4 v1, 0x1

    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    check-cast p1, La/t3b;

    .line 21
    .line 22
    invoke-virtual {p0, p2}, La/q4;->A(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    check-cast p0, La/p3b;

    .line 30
    .line 31
    iget-object p2, p1, La/t3b;->u:La/o3b;

    .line 32
    .line 33
    invoke-virtual {p2, p0}, La/o3b;->setModel(La/p3b;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, La/ymx;->e:La/ymx;

    .line 37
    .line 38
    new-instance v2, La/s3b;

    .line 39
    .line 40
    invoke-direct {v2, p1, p0, v1}, La/s3b;-><init>(La/t3b;La/p3b;B)V

    .line 41
    .line 42
    .line 43
    invoke-static {p2, v0, v2}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :cond_1
    check-cast p1, La/v3b;

    .line 52
    .line 53
    invoke-virtual {p0, p2}, La/q4;->A(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    check-cast p0, La/u3b;

    .line 61
    .line 62
    return-void
.end method

.method public final o(La/xhe0;ILjava/util/List;)V
    .locals 4

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_6

    .line 9
    .line 10
    invoke-virtual {p0, p2}, La/q4;->A(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, La/z3b;

    .line 15
    .line 16
    invoke-interface {v0}, La/z3b;->a()La/n3d;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_5

    .line 25
    .line 26
    const/4 v1, 0x1

    .line 27
    if-ne v0, v1, :cond_4

    .line 28
    .line 29
    check-cast p1, La/t3b;

    .line 30
    .line 31
    invoke-virtual {p0, p2}, La/q4;->A(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    check-cast p0, La/p3b;

    .line 39
    .line 40
    iget-object p2, p1, La/t3b;->u:La/o3b;

    .line 41
    .line 42
    sget-object v0, La/ymx;->e:La/ymx;

    .line 43
    .line 44
    new-instance v2, La/s3b;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-direct {v2, p1, p0, v3}, La/s3b;-><init>(La/t3b;La/p3b;B)V

    .line 48
    .line 49
    .line 50
    invoke-static {p2, v0, v2}, La/dyb;->b0(Landroid/view/View;La/ymx;Lkotlin/jvm/functions/Function1;)La/cjj;

    .line 51
    .line 52
    .line 53
    new-instance p0, La/sx3;

    .line 54
    .line 55
    invoke-direct {p0, p3, v1}, La/sx3;-><init>(Ljava/lang/Object;B)V

    .line 56
    .line 57
    .line 58
    new-instance p1, La/m1b;

    .line 59
    .line 60
    const/4 p3, 0x2

    .line 61
    invoke-direct {p1, p3}, La/m1b;-><init>(B)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, p1}, La/pgi0;->p(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/qls0;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    new-instance p1, La/eoh0;

    .line 69
    .line 70
    const/16 p3, 0x17

    .line 71
    .line 72
    invoke-direct {p1, p3}, La/eoh0;-><init>(B)V

    .line 73
    .line 74
    .line 75
    invoke-static {p0, p1}, La/lgi0;->c(Lkotlin/sequences/Sequence;Lkotlin/jvm/functions/Function1;)La/ckq;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    new-instance p1, La/bkq;

    .line 80
    .line 81
    invoke-direct {p1, p0}, La/bkq;-><init>(La/ckq;)V

    .line 82
    .line 83
    .line 84
    :cond_0
    :goto_0
    invoke-virtual {p1}, La/bkq;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-eqz p0, :cond_3

    .line 89
    .line 90
    invoke-virtual {p1}, La/bkq;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    if-nez p0, :cond_1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_1
    instance-of p3, p0, La/q3b;

    .line 98
    .line 99
    if-eqz p3, :cond_2

    .line 100
    .line 101
    check-cast p0, La/q3b;

    .line 102
    .line 103
    iget-object p0, p0, La/q3b;->a:Ljava/lang/String;

    .line 104
    .line 105
    invoke-virtual {p2, p0}, La/o3b;->setLabel(Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    instance-of p3, p0, La/r3b;

    .line 110
    .line 111
    if-eqz p3, :cond_0

    .line 112
    .line 113
    check-cast p0, La/r3b;

    .line 114
    .line 115
    iget-object p0, p0, La/r3b;->a:La/n0x;

    .line 116
    .line 117
    invoke-virtual {p2, p0}, La/o3b;->setPicture(La/o0x;)V

    .line 118
    .line 119
    .line 120
    goto :goto_0

    .line 121
    :cond_3
    return-void

    .line 122
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :cond_5
    check-cast p1, La/v3b;

    .line 127
    .line 128
    invoke-virtual {p0, p2}, La/q4;->A(I)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object p0

    .line 132
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    check-cast p0, La/u3b;

    .line 136
    .line 137
    return-void

    .line 138
    :cond_6
    invoke-virtual {p0, p1, p2}, La/n3b;->n(La/xhe0;I)V

    .line 139
    .line 140
    .line 141
    return-void
.end method

.method public final p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 2

    .line 1
    sget-object v0, La/n3d;->d:La/c0o;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, La/c0o;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, La/n3d;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    const/4 v0, 0x0

    .line 14
    if-eqz p2, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne p2, v1, :cond_0

    .line 18
    .line 19
    new-instance p2, La/t3b;

    .line 20
    .line 21
    new-instance v0, La/o3b;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, La/n3b;->f:La/ntl;

    .line 31
    .line 32
    invoke-direct {v0, p1, v1}, La/o3b;-><init>(Landroid/content/Context;La/ntl;)V

    .line 33
    .line 34
    .line 35
    new-instance p1, La/lya;

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-direct {p1, p0, v1}, La/lya;-><init>(Ljava/lang/Object;B)V

    .line 39
    .line 40
    .line 41
    invoke-direct {p2, v0, p1}, La/t3b;-><init>(La/o3b;La/lya;)V

    .line 42
    .line 43
    .line 44
    return-object p2

    .line 45
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 46
    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_1
    new-instance p0, La/v3b;

    .line 50
    .line 51
    new-instance p2, La/so5;

    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    const/4 v1, 0x6

    .line 61
    invoke-direct {p2, p1, v0, v1}, La/so5;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;B)V

    .line 62
    .line 63
    .line 64
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    const v0, 0x7f0d0079

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0, p2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 72
    .line 73
    .line 74
    invoke-direct {p0, p2}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 75
    .line 76
    .line 77
    return-object p0
.end method
