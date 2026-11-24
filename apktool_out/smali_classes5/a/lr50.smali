.class public final synthetic La/lr50;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qr50;


# direct methods
.method public synthetic constructor <init>(La/qr50;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lr50;->a:B

    iput-object p1, p0, La/lr50;->b:La/qr50;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, La/lr50;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/lr50;->b:La/qr50;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/oyg0;

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, La/gr50;

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    const p1, 0x7f131690

    .line 20
    .line 21
    .line 22
    const-wide/16 v1, 0x2710

    .line 23
    .line 24
    const p2, 0x7f1307c4

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p2, p1, v1, v2}, La/qr50;->M(IIJ)La/mdm;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    const/16 v6, 0x1e

    .line 32
    .line 33
    const/4 v1, 0x0

    .line 34
    const/4 v2, 0x0

    .line 35
    const/4 v3, 0x0

    .line 36
    const/4 v4, 0x0

    .line 37
    invoke-static/range {v0 .. v6}, La/gr50;->a(La/gr50;ZILjava/util/List;Ljava/util/List;La/mdm;I)La/gr50;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0

    .line 42
    :pswitch_0
    check-cast p1, Ljava/lang/Throwable;

    .line 43
    .line 44
    check-cast p2, Ljava/lang/String;

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    new-instance p1, La/lr50;

    .line 53
    .line 54
    const/4 p2, 0x1

    .line 55
    invoke-direct {p1, p0, p2}, La/lr50;-><init>(La/qr50;B)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 59
    .line 60
    .line 61
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 62
    .line 63
    return-object p0

    .line 64
    nop

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
