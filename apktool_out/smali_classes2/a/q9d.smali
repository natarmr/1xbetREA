.class public final La/q9d;
.super La/dzj0;
.source "SourceFile"


# instance fields
.field public final synthetic b:B


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/q9d;->b:B

    invoke-direct {p0, p1}, La/dzj0;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public a(La/htw;Ljava/lang/String;La/j;)V
    .locals 4

    .line 1
    iget-byte v0, p0, La/q9d;->b:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, La/nw70;->a(La/htw;Ljava/lang/String;La/j;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    instance-of v0, p3, La/id00;

    .line 14
    .line 15
    const-string v1, ""

    .line 16
    .line 17
    if-eqz v0, :cond_3

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2, p3}, La/dzj0;->c(La/htw;Ljava/lang/String;La/j;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p3, La/j;->d:La/zkd;

    .line 23
    .line 24
    instance-of v2, v0, La/xc00;

    .line 25
    .line 26
    if-eqz v2, :cond_2

    .line 27
    .line 28
    check-cast v0, La/xc00;

    .line 29
    .line 30
    iget-object v0, v0, La/xc00;->f:La/a8z;

    .line 31
    .line 32
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Ljava/lang/Boolean;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    check-cast p3, La/zkd;

    .line 43
    .line 44
    iget-object p3, p3, La/zkd;->e:Ljava/util/List;

    .line 45
    .line 46
    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p3

    .line 50
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, La/j;

    .line 61
    .line 62
    iget-object v2, v1, La/j;->a:La/ar20;

    .line 63
    .line 64
    sget-object v3, La/wb;->v:La/ar20;

    .line 65
    .line 66
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_0

    .line 71
    .line 72
    if-nez v0, :cond_0

    .line 73
    .line 74
    sget-object v2, La/nd00;->b:La/nd00;

    .line 75
    .line 76
    invoke-virtual {v2, p1, p2, v1}, La/fdx;->a(La/htw;Ljava/lang/String;La/j;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_0
    invoke-virtual {p1, v1}, La/htw;->e0(La/j;)V

    .line 81
    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_1
    iget-object p0, p0, La/dzj0;->a:Ljava/lang/String;

    .line 85
    .line 86
    invoke-virtual {p1, p0}, La/htw;->g0(Ljava/lang/CharSequence;)V

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_2
    new-instance p0, La/byw;

    .line 91
    .line 92
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw p0

    .line 96
    :cond_3
    new-instance p0, La/byw;

    .line 97
    .line 98
    invoke-direct {p0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    throw p0

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public c(La/htw;Ljava/lang/String;La/j;)V
    .locals 4

    .line 1
    iget-byte v0, p0, La/q9d;->b:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, La/dzj0;->c(La/htw;Ljava/lang/String;La/j;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    sget-object p0, La/wb;->p:La/ar20;

    .line 14
    .line 15
    invoke-static {p3, p0}, La/dwi0;->L(La/j;La/ar20;)La/j;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 v0, 0x1

    .line 20
    const/4 v1, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    sget-object v3, La/cy2;->Z:La/ar20;

    .line 25
    .line 26
    invoke-static {p0, v3}, La/dwi0;->L(La/j;La/ar20;)La/j;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    invoke-static {p0, p2}, La/dwi0;->N(La/j;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    invoke-static {p0}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    invoke-static {v0, v1, p0}, La/vqd;->k(IILjava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    new-array p2, v0, [C

    .line 59
    .line 60
    const/16 v3, 0x30

    .line 61
    .line 62
    aput-char v3, p2, v1

    .line 63
    .line 64
    invoke-static {p0, p2}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    const-string p2, "1"

    .line 69
    .line 70
    invoke-virtual {p0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p2

    .line 74
    if-nez p2, :cond_1

    .line 75
    .line 76
    new-instance p2, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v2, "start=\""

    .line 79
    .line 80
    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 84
    .line 85
    .line 86
    move-result v2

    .line 87
    if-nez v2, :cond_0

    .line 88
    .line 89
    const-string p0, "0"

    .line 90
    .line 91
    :cond_0
    const/16 v2, 0x22

    .line 92
    .line 93
    invoke-static {p2, p0, v2}, La/axq;->m(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    :cond_1
    new-array p0, v0, [Ljava/lang/CharSequence;

    .line 98
    .line 99
    aput-object v2, p0, v1

    .line 100
    .line 101
    const-string p2, "ol"

    .line 102
    .line 103
    invoke-virtual {p1, p3, p2, p0, v1}, La/htw;->h0(La/j;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;Z)V

    .line 104
    .line 105
    .line 106
    return-void

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
