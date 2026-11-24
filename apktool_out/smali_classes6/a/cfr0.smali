.class public final synthetic La/cfr0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ofr0;


# direct methods
.method public synthetic constructor <init>(La/ofr0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cfr0;->a:B

    iput-object p1, p0, La/cfr0;->b:La/ofr0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/cfr0;->a:B

    .line 2
    .line 3
    sget-object v1, La/d1r0;->a:La/d1r0;

    .line 4
    .line 5
    iget-object p0, p0, La/cfr0;->b:La/ofr0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/n0r0;

    .line 11
    .line 12
    sget-object v2, La/iun;->a:La/iun;

    .line 13
    .line 14
    invoke-direct {v0, v1, v2}, La/n0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, La/ofr0;->V(La/a1r0;)V

    .line 18
    .line 19
    .line 20
    new-instance v0, La/m0r0;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, La/m0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, La/ofr0;->V(La/a1r0;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_0
    new-instance v0, La/q0r0;

    .line 32
    .line 33
    sget-object v2, La/iun;->a:La/iun;

    .line 34
    .line 35
    invoke-direct {v0, v1, v2}, La/q0r0;-><init>(La/h1r0;Ljava/util/List;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, La/ofr0;->V(La/a1r0;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    return-object p0

    .line 44
    :pswitch_1
    new-instance v0, La/shq0;

    .line 45
    .line 46
    const/16 v1, 0x1b

    .line 47
    .line 48
    invoke-direct {v0, v1}, La/shq0;-><init>(B)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 52
    .line 53
    .line 54
    sget-object v0, La/n8r0;->b:La/n8r0;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, La/ofr0;->Y(La/n8r0;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, La/ofr0;->N()V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, La/ofr0;->q0:La/c4m0;

    .line 63
    .line 64
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 65
    .line 66
    .line 67
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    return-object p0

    .line 70
    :pswitch_2
    iget-object v0, p0, La/ofr0;->r0:La/c4m0;

    .line 71
    .line 72
    invoke-static {v0}, La/e3c;->n(La/bby;)V

    .line 73
    .line 74
    .line 75
    iget-object p0, p0, La/ofr0;->s0:La/c4m0;

    .line 76
    .line 77
    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 78
    .line 79
    .line 80
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 81
    .line 82
    return-object p0

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
