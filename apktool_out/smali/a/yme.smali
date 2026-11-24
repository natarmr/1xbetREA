.class public final synthetic La/yme;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ane;


# direct methods
.method public synthetic constructor <init>(La/ane;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yme;->a:B

    iput-object p1, p0, La/yme;->b:La/ane;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/yme;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object p0, p0, La/yme;->b:La/ane;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/ane;->s:La/djz;

    .line 10
    .line 11
    iget-object v1, p0, La/ane;->z:La/cqq;

    .line 12
    .line 13
    iget-boolean p0, p0, La/ane;->t:Z

    .line 14
    .line 15
    invoke-virtual {v0}, La/djz;->b()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-nez v2, :cond_0

    .line 20
    .line 21
    invoke-static {v1}, La/cqq;->a(La/cqq;)V

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-nez p0, :cond_1

    .line 26
    .line 27
    iget-object p0, v0, La/djz;->c:La/pkk0;

    .line 28
    .line 29
    if-eqz p0, :cond_1

    .line 30
    .line 31
    check-cast p0, La/r3k;

    .line 32
    .line 33
    invoke-virtual {p0}, La/r3k;->b()V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_0
    iget-object v0, p0, La/ane;->s:La/djz;

    .line 40
    .line 41
    iget-object v0, v0, La/djz;->w:La/ome;

    .line 42
    .line 43
    iget-object p0, p0, La/ane;->y:La/k3x;

    .line 44
    .line 45
    iget p0, p0, La/k3x;->e:I

    .line 46
    .line 47
    iget-object v0, v0, La/ome;->b:La/djz;

    .line 48
    .line 49
    iget-object v0, v0, La/djz;->r:La/jly;

    .line 50
    .line 51
    invoke-virtual {v0, p0}, La/jly;->b(I)Z

    .line 52
    .line 53
    .line 54
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_1
    iget-object p0, p0, La/ane;->x:La/k7q0;

    .line 58
    .line 59
    invoke-virtual {p0}, La/k7q0;->o()V

    .line 60
    .line 61
    .line 62
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 63
    .line 64
    return-object p0

    .line 65
    :pswitch_2
    invoke-static {p0}, La/vcc;->W(La/yzj;)V

    .line 66
    .line 67
    .line 68
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 69
    .line 70
    return-object p0

    .line 71
    :pswitch_3
    iget-object p0, p0, La/ane;->x:La/k7q0;

    .line 72
    .line 73
    invoke-virtual {p0}, La/k7q0;->c()V

    .line 74
    .line 75
    .line 76
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_4
    iget-object p0, p0, La/ane;->x:La/k7q0;

    .line 80
    .line 81
    invoke-virtual {p0, v1}, La/k7q0;->a(Z)La/c4m0;

    .line 82
    .line 83
    .line 84
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_5
    iget-object p0, p0, La/ane;->x:La/k7q0;

    .line 88
    .line 89
    invoke-virtual {p0, v1}, La/k7q0;->e(Z)V

    .line 90
    .line 91
    .line 92
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_6
    invoke-static {p0}, La/vcc;->W(La/yzj;)V

    .line 96
    .line 97
    .line 98
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 99
    .line 100
    return-object p0

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
