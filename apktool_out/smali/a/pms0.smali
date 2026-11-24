.class public final synthetic La/pms0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/oms0;


# direct methods
.method public synthetic constructor <init>(La/oms0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/pms0;->a:B

    iput-object p1, p0, La/pms0;->b:La/oms0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/pms0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/pms0;->b:La/oms0;

    .line 4
    .line 5
    check-cast p1, La/lwk;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, La/qms0;

    .line 11
    .line 12
    const/4 v0, 0x1

    .line 13
    invoke-direct {p1, p0, v0}, La/qms0;-><init>(La/oms0;B)V

    .line 14
    .line 15
    .line 16
    return-object p1

    .line 17
    :pswitch_0
    new-instance p1, La/qms0;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    invoke-direct {p1, p0, v0}, La/qms0;-><init>(La/oms0;B)V

    .line 21
    .line 22
    .line 23
    return-object p1

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
