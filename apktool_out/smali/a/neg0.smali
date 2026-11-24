.class public final La/neg0;
.super La/b7z;
.source "SourceFile"


# static fields
.field public static final c:La/neg0;


# instance fields
.field public final synthetic b:B


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/neg0;

    .line 2
    .line 3
    const-string v1, "Undefined intrinsics block and it is required"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, La/neg0;-><init>(Ljava/lang/String;B)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/neg0;->c:La/neg0;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/neg0;->b:B

    invoke-direct {p0, p1}, La/b7z;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final b(La/vj30;Ljava/util/List;J)La/uj30;
    .locals 6

    .line 1
    iget-byte p0, p0, La/neg0;->b:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 7
    .line 8
    const-string p1, "Undefined measure and it is required"

    .line 9
    .line 10
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :pswitch_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    if-eqz p0, :cond_2

    .line 19
    .line 20
    const/4 v0, 0x1

    .line 21
    const/4 v1, 0x0

    .line 22
    if-eq p0, v0, :cond_1

    .line 23
    .line 24
    new-instance p0, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    invoke-direct {p0, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-interface {p2}, Ljava/util/Collection;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    move v2, v1

    .line 38
    move v3, v2

    .line 39
    :goto_0
    if-ge v1, v0, :cond_0

    .line 40
    .line 41
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, La/pj30;

    .line 46
    .line 47
    invoke-interface {v4, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    iget v5, v4, La/pu90;->a:I

    .line 52
    .line 53
    invoke-static {v5, v2}, Ljava/lang/Math;->max(II)I

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    iget v5, v4, La/pu90;->b:I

    .line 58
    .line 59
    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    invoke-virtual {p0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-static {v2, p3, p4}, La/r4e;->g(IJ)I

    .line 70
    .line 71
    .line 72
    move-result p2

    .line 73
    invoke-static {v3, p3, p4}, La/r4e;->f(IJ)I

    .line 74
    .line 75
    .line 76
    move-result p3

    .line 77
    new-instance p4, La/uy2;

    .line 78
    .line 79
    const/16 v0, 0xe

    .line 80
    .line 81
    invoke-direct {p4, p0, v0}, La/uy2;-><init>(Ljava/util/ArrayList;B)V

    .line 82
    .line 83
    .line 84
    invoke-static {p1, p2, p3, p4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    goto :goto_1

    .line 89
    :cond_1
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    check-cast p0, La/pj30;

    .line 94
    .line 95
    invoke-interface {p0, p3, p4}, La/pj30;->S(J)La/pu90;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    iget p2, p0, La/pu90;->a:I

    .line 100
    .line 101
    invoke-static {p2, p3, p4}, La/r4e;->g(IJ)I

    .line 102
    .line 103
    .line 104
    move-result p2

    .line 105
    iget v0, p0, La/pu90;->b:I

    .line 106
    .line 107
    invoke-static {v0, p3, p4}, La/r4e;->f(IJ)I

    .line 108
    .line 109
    .line 110
    move-result p3

    .line 111
    new-instance p4, La/cam;

    .line 112
    .line 113
    const/16 v0, 0x1b

    .line 114
    .line 115
    invoke-direct {p4, p0, v0}, La/cam;-><init>(La/pu90;B)V

    .line 116
    .line 117
    .line 118
    invoke-static {p1, p2, p3, p4}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    goto :goto_1

    .line 123
    :cond_2
    invoke-static {p3, p4}, La/p4e;->k(J)I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    invoke-static {p3, p4}, La/p4e;->j(J)I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    new-instance p3, La/wtf0;

    .line 132
    .line 133
    const/16 p4, 0xf

    .line 134
    .line 135
    invoke-direct {p3, p4}, La/wtf0;-><init>(B)V

    .line 136
    .line 137
    .line 138
    invoke-static {p1, p0, p2, p3}, La/vj30;->x(La/vj30;IILkotlin/jvm/functions/Function1;)La/uj30;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    :goto_1
    return-object p0

    .line 143
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
