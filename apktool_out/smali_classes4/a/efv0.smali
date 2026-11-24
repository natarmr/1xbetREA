.class public final synthetic La/efv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/i3t0;

.field public final synthetic c:La/pz40;


# direct methods
.method public synthetic constructor <init>(La/i3t0;La/pz40;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/efv0;->a:B

    iput-object p1, p0, La/efv0;->b:La/i3t0;

    iput-object p2, p0, La/efv0;->c:La/pz40;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/efv0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/efv0;->c:La/pz40;

    .line 4
    .line 5
    iget-object p0, p0, La/efv0;->b:La/i3t0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget v0, La/ffv0;->k2:I

    .line 11
    .line 12
    new-instance v0, La/cfv0;

    .line 13
    .line 14
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    invoke-direct {v0, v1}, La/cfv0;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_0
    sget v0, La/ffv0;->k2:I

    .line 30
    .line 31
    new-instance v0, La/cfv0;

    .line 32
    .line 33
    invoke-interface {v1}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    check-cast v1, Ljava/lang/String;

    .line 38
    .line 39
    invoke-direct {v0, v1}, La/cfv0;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, La/i3t0;->x(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 46
    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
