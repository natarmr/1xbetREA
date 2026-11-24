.class public final synthetic La/rg3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/wn;


# instance fields
.field public final synthetic a:B


# direct methods
.method public synthetic constructor <init>(B)V
    .locals 0

    .line 1
    iput-byte p1, p0, La/rg3;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iget-byte p0, p0, La/rg3;->a:B

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 7
    .line 8
    sget-object p0, La/co00;->R1:La/xuz;

    .line 9
    .line 10
    iget p0, p1, Landroidx/activity/result/ActivityResult;->a:I

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    check-cast p1, Lkotlin/Unit;

    .line 14
    .line 15
    sget-object p0, La/qp4;->R1:La/hfk0;

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_1
    check-cast p1, Landroidx/activity/result/ActivityResult;

    .line 19
    .line 20
    sget-object p0, La/vg3;->R1:La/hfk0;

    .line 21
    .line 22
    iget p0, p1, Landroidx/activity/result/ActivityResult;->a:I

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
