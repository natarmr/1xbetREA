.class public final synthetic La/fgn0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hgn0;


# direct methods
.method public synthetic constructor <init>(La/hgn0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/fgn0;->a:B

    iput-object p1, p0, La/fgn0;->b:La/hgn0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/fgn0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/fgn0;->b:La/hgn0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/hgn0;->k2:La/m6m0;

    .line 10
    .line 11
    sget-object v0, La/fhn0;->c:La/fhn0;

    .line 12
    .line 13
    invoke-virtual {p0, v0, v1}, La/hgn0;->Z0(La/fhn0;Z)V

    .line 14
    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    return-object p0

    .line 19
    :pswitch_0
    sget-object v0, La/hgn0;->k2:La/m6m0;

    .line 20
    .line 21
    sget-object v0, La/fhn0;->c:La/fhn0;

    .line 22
    .line 23
    invoke-virtual {p0, v0, v1}, La/hgn0;->Z0(La/fhn0;Z)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0

    .line 29
    :pswitch_1
    sget-object v0, La/hgn0;->k2:La/m6m0;

    .line 30
    .line 31
    sget-object v0, La/fhn0;->c:La/fhn0;

    .line 32
    .line 33
    invoke-virtual {p0, v0, v1}, La/hgn0;->Z0(La/fhn0;Z)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
