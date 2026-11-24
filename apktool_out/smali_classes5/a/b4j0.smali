.class public final synthetic La/b4j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/d4j0;


# direct methods
.method public synthetic constructor <init>(La/d4j0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/b4j0;->a:B

    iput-object p1, p0, La/b4j0;->b:La/d4j0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/b4j0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/b4j0;->b:La/d4j0;

    .line 4
    .line 5
    check-cast p1, Ljava/lang/String;

    .line 6
    .line 7
    check-cast p2, Landroid/os/Bundle;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    sget-object v0, La/d4j0;->S1:La/eke0;

    .line 13
    .line 14
    const-string v0, "DefaultBetSumBottomSheetKey"

    .line 15
    .line 16
    invoke-static {p2, p1, v0}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, La/d4j0;->I0()La/w5j0;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance v0, La/s4j0;

    .line 30
    .line 31
    invoke-virtual {p2, p1}, Landroid/os/BaseBundle;->getDouble(Ljava/lang/String;)D

    .line 32
    .line 33
    .line 34
    move-result-wide p1

    .line 35
    invoke-direct {v0, p1, p2}, La/s4j0;-><init>(D)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, La/w5j0;->z(La/a5j0;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 42
    .line 43
    :goto_0
    return-object p0

    .line 44
    :pswitch_0
    sget-object v0, La/d4j0;->S1:La/eke0;

    .line 45
    .line 46
    const-string v0, "QuickBetSumBottomSheetKey"

    .line 47
    .line 48
    invoke-static {p2, p1, v0}, La/h97;->B(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_1

    .line 53
    .line 54
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    invoke-virtual {p0}, La/d4j0;->I0()La/w5j0;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    sget-object p1, La/y4j0;->a:La/y4j0;

    .line 62
    .line 63
    invoke-virtual {p0, p1}, La/w5j0;->z(La/a5j0;)V

    .line 64
    .line 65
    .line 66
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    :goto_1
    return-object p0

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
