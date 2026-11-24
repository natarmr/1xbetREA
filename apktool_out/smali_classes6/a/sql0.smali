.class public final La/sql0;
.super La/q4;
.source "SourceFile"


# static fields
.field public static final h:La/pn20;


# instance fields
.field public f:La/xdr;

.field public g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/pn20;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/pn20;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/sql0;->h:La/pn20;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final f(I)I
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, La/q4;->A(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, La/lql0;

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    if-eqz p0, :cond_2

    .line 9
    .line 10
    instance-of v0, p0, La/kql0;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object p0, La/ae9;->a:La/ae9;

    .line 15
    .line 16
    const/4 p0, 0x2

    .line 17
    return p0

    .line 18
    :cond_0
    instance-of v0, p0, La/iql0;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    sget-object p0, La/ae9;->a:La/ae9;

    .line 23
    .line 24
    return p1

    .line 25
    :cond_1
    instance-of p0, p0, La/jql0;

    .line 26
    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    sget-object p0, La/ae9;->a:La/ae9;

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 34
    .line 35
    .line 36
    return p1
.end method

.method public final n(La/xhe0;I)V
    .locals 3

    .line 1
    iget-object v0, p1, La/xhe0;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {p0, p2}, La/q4;->A(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, La/lql0;

    .line 8
    .line 9
    if-eqz p2, :cond_8

    .line 10
    .line 11
    instance-of v1, p2, La/kql0;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    instance-of v1, p1, La/rql0;

    .line 17
    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    move-object v2, p1

    .line 21
    check-cast v2, La/rql0;

    .line 22
    .line 23
    :cond_0
    if-eqz v2, :cond_1

    .line 24
    .line 25
    move-object p1, p2

    .line 26
    check-cast p1, La/kql0;

    .line 27
    .line 28
    iget-object p1, p1, La/kql0;->b:La/vql0;

    .line 29
    .line 30
    iget-object v1, v2, La/rql0;->u:La/tql0;

    .line 31
    .line 32
    iget-object v2, p1, La/vql0;->c:La/n0x;

    .line 33
    .line 34
    invoke-virtual {v1, v2}, La/tql0;->setIcon(La/o0x;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, p1, La/vql0;->b:Ljava/lang/String;

    .line 38
    .line 39
    invoke-virtual {v1, p1}, La/tql0;->setTitle(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    new-instance p1, La/u5l0;

    .line 46
    .line 47
    const/16 v1, 0x8

    .line 48
    .line 49
    invoke-direct {p1, p0, p2, v1}, La/u5l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    invoke-static {v0, p1}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_2
    instance-of v1, p2, La/iql0;

    .line 57
    .line 58
    if-eqz v1, :cond_5

    .line 59
    .line 60
    instance-of v1, p1, La/pql0;

    .line 61
    .line 62
    if-eqz v1, :cond_3

    .line 63
    .line 64
    move-object v2, p1

    .line 65
    check-cast v2, La/pql0;

    .line 66
    .line 67
    :cond_3
    if-eqz v2, :cond_4

    .line 68
    .line 69
    check-cast p2, La/iql0;

    .line 70
    .line 71
    iget-object p1, p2, La/iql0;->b:La/ud9;

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    iget-object p2, v2, La/pql0;->u:La/tql0;

    .line 77
    .line 78
    iget-object v1, p1, La/ud9;->b:La/m0x;

    .line 79
    .line 80
    invoke-virtual {p2, v1}, La/tql0;->setIcon(La/o0x;)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p1, La/ud9;->a:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {p2, p1}, La/tql0;->setTitle(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    new-instance p1, La/oql0;

    .line 92
    .line 93
    const/4 p2, 0x0

    .line 94
    invoke-direct {p1, p0, p2}, La/oql0;-><init>(La/sql0;B)V

    .line 95
    .line 96
    .line 97
    invoke-static {v0, p1}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 98
    .line 99
    .line 100
    return-void

    .line 101
    :cond_5
    instance-of v1, p2, La/jql0;

    .line 102
    .line 103
    if-eqz v1, :cond_8

    .line 104
    .line 105
    instance-of v1, p1, La/qql0;

    .line 106
    .line 107
    if-eqz v1, :cond_6

    .line 108
    .line 109
    move-object v2, p1

    .line 110
    check-cast v2, La/qql0;

    .line 111
    .line 112
    :cond_6
    if-eqz v2, :cond_7

    .line 113
    .line 114
    check-cast p2, La/jql0;

    .line 115
    .line 116
    iget-object p1, p2, La/jql0;->b:La/ke9;

    .line 117
    .line 118
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 119
    .line 120
    .line 121
    iget-object p2, v2, La/qql0;->u:La/tql0;

    .line 122
    .line 123
    iget-object v1, p1, La/ke9;->b:La/m0x;

    .line 124
    .line 125
    invoke-virtual {p2, v1}, La/tql0;->setIcon(La/o0x;)V

    .line 126
    .line 127
    .line 128
    iget-object p1, p1, La/ke9;->a:Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {p2, p1}, La/tql0;->setTitle(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    new-instance p1, La/oql0;

    .line 137
    .line 138
    const/4 p2, 0x1

    .line 139
    invoke-direct {p1, p0, p2}, La/oql0;-><init>(La/sql0;B)V

    .line 140
    .line 141
    .line 142
    invoke-static {v0, p1}, La/dyb;->c0(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :cond_8
    invoke-static {}, La/t9f;->b()V

    .line 147
    .line 148
    .line 149
    return-void
.end method

.method public final p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 1

    .line 1
    sget-object v0, La/ae9;->e:La/c0o;

    .line 2
    .line 3
    invoke-virtual {v0, p2}, La/c0o;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    check-cast p2, La/ae9;

    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 10
    .line 11
    .line 12
    move-result p2

    .line 13
    if-eqz p2, :cond_2

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    if-eq p2, v0, :cond_1

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    if-ne p2, v0, :cond_0

    .line 20
    .line 21
    new-instance p2, La/tql0;

    .line 22
    .line 23
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iget p0, p0, La/sql0;->g:I

    .line 30
    .line 31
    invoke-direct {v0, p1, p0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p2, v0}, La/tql0;-><init>(Landroid/view/ContextThemeWrapper;)V

    .line 35
    .line 36
    .line 37
    new-instance p0, La/rql0;

    .line 38
    .line 39
    invoke-direct {p0, p2}, La/rql0;-><init>(La/tql0;)V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0

    .line 48
    :cond_1
    new-instance p2, La/tql0;

    .line 49
    .line 50
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 51
    .line 52
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 53
    .line 54
    .line 55
    move-result-object p1

    .line 56
    iget p0, p0, La/sql0;->g:I

    .line 57
    .line 58
    invoke-direct {v0, p1, p0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 59
    .line 60
    .line 61
    invoke-direct {p2, v0}, La/tql0;-><init>(Landroid/view/ContextThemeWrapper;)V

    .line 62
    .line 63
    .line 64
    new-instance p0, La/qql0;

    .line 65
    .line 66
    invoke-direct {p0, p2}, La/qql0;-><init>(La/tql0;)V

    .line 67
    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_2
    new-instance p2, La/tql0;

    .line 71
    .line 72
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    iget p0, p0, La/sql0;->g:I

    .line 79
    .line 80
    invoke-direct {v0, p1, p0}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p2, v0}, La/tql0;-><init>(Landroid/view/ContextThemeWrapper;)V

    .line 84
    .line 85
    .line 86
    new-instance p0, La/pql0;

    .line 87
    .line 88
    invoke-direct {p0, p2}, La/pql0;-><init>(La/tql0;)V

    .line 89
    .line 90
    .line 91
    return-object p0
.end method
