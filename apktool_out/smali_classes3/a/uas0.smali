.class public final La/uas0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Z

.field public final synthetic k:La/yas0;


# direct methods
.method public constructor <init>(La/yas0;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/uas0;->i:B

    .line 13
    iput-object p1, p0, La/uas0;->k:La/yas0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(ZLa/yas0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/uas0;->i:B

    .line 3
    .line 4
    iput-boolean p1, p0, La/uas0;->j:Z

    .line 5
    .line 6
    iput-object p2, p0, La/uas0;->k:La/yas0;

    .line 7
    .line 8
    const/4 p1, 0x2

    .line 9
    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/uas0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/uas0;->k:La/yas0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, La/uas0;

    .line 9
    .line 10
    invoke-direct {p0, v1, p2}, La/uas0;-><init>(La/yas0;La/yje;)V

    .line 11
    .line 12
    .line 13
    check-cast p1, Ljava/lang/Boolean;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iput-boolean p1, p0, La/uas0;->j:Z

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    new-instance p1, La/uas0;

    .line 23
    .line 24
    iget-boolean p0, p0, La/uas0;->j:Z

    .line 25
    .line 26
    invoke-direct {p1, p0, v1, p2}, La/uas0;-><init>(ZLa/yas0;La/yje;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/uas0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/uas0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/uas0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/uas0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/kmq;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/uas0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/uas0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/uas0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iget-byte v0, p0, La/uas0;->i:B

    .line 2
    .line 3
    const/16 v1, 0x1b

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, La/uas0;->k:La/yas0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-boolean v0, p0, La/uas0;->j:Z

    .line 12
    .line 13
    sget-object p0, La/wne;->a:La/wne;

    .line 14
    .line 15
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget p0, La/yas0;->z:I

    .line 19
    .line 20
    iget-object p0, v3, La/i3t0;->i:La/ocj;

    .line 21
    .line 22
    iget-object v4, p0, La/ocj;->a:La/p7m0;

    .line 23
    .line 24
    :cond_0
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iget-object p1, v3, La/i3t0;->f:La/oyg0;

    .line 32
    .line 33
    move-object v5, p0

    .line 34
    check-cast v5, La/sas0;

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    iget-object p1, v5, La/sas0;->c:La/fas0;

    .line 40
    .line 41
    instance-of v6, p1, La/cas0;

    .line 42
    .line 43
    if-eqz v6, :cond_1

    .line 44
    .line 45
    check-cast p1, La/cas0;

    .line 46
    .line 47
    const/4 v6, 0x1

    .line 48
    const/4 v7, 0x0

    .line 49
    invoke-static {p1, v7, v0, v6}, La/cas0;->a(La/cas0;La/gu1;ZI)La/cas0;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {v5, p1, v2, v1}, La/sas0;->a(La/sas0;La/fas0;ZI)La/sas0;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    :cond_1
    invoke-virtual {v4, p0, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    if-eqz p0, :cond_0

    .line 62
    .line 63
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 67
    .line 68
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    iget-boolean p0, p0, La/uas0;->j:Z

    .line 72
    .line 73
    if-eqz p0, :cond_3

    .line 74
    .line 75
    sget p0, La/yas0;->z:I

    .line 76
    .line 77
    iget-object p0, v3, La/i3t0;->i:La/ocj;

    .line 78
    .line 79
    iget-object p0, p0, La/ocj;->a:La/p7m0;

    .line 80
    .line 81
    :cond_2
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-object v0, p1

    .line 89
    check-cast v0, La/sas0;

    .line 90
    .line 91
    sget-object v3, La/eas0;->a:La/eas0;

    .line 92
    .line 93
    invoke-static {v0, v3, v2, v1}, La/sas0;->a(La/sas0;La/fas0;ZI)La/sas0;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    invoke-virtual {p0, p1, v0}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    if-eqz p1, :cond_2

    .line 102
    .line 103
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 104
    .line 105
    return-object p0

    .line 106
    nop

    .line 107
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
