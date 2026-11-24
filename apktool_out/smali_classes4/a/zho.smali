.class public final synthetic La/zho;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/cio;


# direct methods
.method public synthetic constructor <init>(La/cio;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zho;->a:B

    iput-object p1, p0, La/zho;->b:La/cio;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/zho;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/zho;->b:La/cio;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, Ljava/lang/String;

    .line 9
    .line 10
    sget-object v0, La/cio;->P1:La/ddk;

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, La/cio;->H0()La/k3t0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance v0, La/dg2;

    .line 20
    .line 21
    invoke-direct {v0, p1}, La/dg2;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    sget-object v0, La/cio;->P1:La/ddk;

    .line 37
    .line 38
    invoke-virtual {p0}, La/cio;->H0()La/k3t0;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    new-instance v0, La/bg2;

    .line 43
    .line 44
    invoke-direct {v0, p1}, La/bg2;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_1
    check-cast p1, La/uid;

    .line 54
    .line 55
    sget-object v0, La/cio;->P1:La/ddk;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, La/cio;->H0()La/k3t0;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    new-instance v0, La/sf2;

    .line 65
    .line 66
    invoke-direct {v0, p1}, La/sf2;-><init>(La/uid;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
