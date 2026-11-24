.class public final synthetic La/fsu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hsu0;


# direct methods
.method public synthetic constructor <init>(La/hsu0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fsu0;->a:B

    iput-object p1, p0, La/fsu0;->b:La/hsu0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/fsu0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/fsu0;->b:La/hsu0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/c240;

    .line 9
    .line 10
    sget-object v0, La/hsu0;->O1:La/svs0;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, La/hsu0;->M1:La/kiu0;

    .line 16
    .line 17
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, La/rio0;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, La/rio0;->C(La/f240;)V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, La/rio0;->z:La/i1w0;

    .line 27
    .line 28
    new-instance v1, La/itn0;

    .line 29
    .line 30
    const/16 v2, 0xc

    .line 31
    .line 32
    invoke-direct {v1, p0, p1, v2}, La/itn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_0
    check-cast p1, La/d240;

    .line 42
    .line 43
    sget-object v0, La/hsu0;->O1:La/svs0;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, La/hsu0;->M1:La/kiu0;

    .line 49
    .line 50
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    check-cast p0, La/rio0;

    .line 55
    .line 56
    invoke-virtual {p0, p1}, La/rio0;->C(La/f240;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, La/rio0;->z:La/i1w0;

    .line 60
    .line 61
    new-instance v1, La/itn0;

    .line 62
    .line 63
    const/16 v2, 0xd

    .line 64
    .line 65
    invoke-direct {v1, p0, p1, v2}, La/itn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, v1}, La/i1w0;->d(Lkotlin/jvm/functions/Function1;)V

    .line 69
    .line 70
    .line 71
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 72
    .line 73
    return-object p0

    .line 74
    :pswitch_1
    check-cast p1, La/f240;

    .line 75
    .line 76
    sget-object v0, La/hsu0;->O1:La/svs0;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    iget-object p0, p0, La/hsu0;->M1:La/kiu0;

    .line 82
    .line 83
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, La/rio0;

    .line 88
    .line 89
    invoke-virtual {p0, p1}, La/rio0;->E(La/f240;)V

    .line 90
    .line 91
    .line 92
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 93
    .line 94
    return-object p0

    .line 95
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
