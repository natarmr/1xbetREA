.class public final synthetic La/el70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hl70;


# direct methods
.method public synthetic constructor <init>(La/hl70;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/el70;->a:B

    iput-object p1, p0, La/el70;->b:La/hl70;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/el70;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/el70;->b:La/hl70;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/hl70;->Q1:La/fl70;

    .line 9
    .line 10
    iget-object p0, p0, La/hl70;->O1:La/kiu0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/ol70;

    .line 17
    .line 18
    iget-object v0, p0, La/ol70;->f:La/spx;

    .line 19
    .line 20
    invoke-virtual {v0}, La/spx;->a()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    iget-object v0, p0, La/ol70;->i:La/lzt;

    .line 27
    .line 28
    invoke-virtual {v0}, La/lzt;->a()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    sget-object v0, La/gle;->a:La/gle;

    .line 36
    .line 37
    invoke-virtual {p0, v0}, La/ol70;->w(La/zy5;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    return-object p0

    .line 43
    :pswitch_0
    sget-object v0, La/hl70;->Q1:La/fl70;

    .line 44
    .line 45
    new-instance v0, La/ko60;

    .line 46
    .line 47
    const/4 v1, 0x5

    .line 48
    invoke-direct {v0, p0, v1}, La/ko60;-><init>(Landroidx/fragment/app/Fragment;B)V

    .line 49
    .line 50
    .line 51
    return-object v0

    .line 52
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
