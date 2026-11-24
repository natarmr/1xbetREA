.class public final synthetic La/vjg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/yiw;


# direct methods
.method public synthetic constructor <init>(La/yiw;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vjg;->a:B

    iput-object p1, p0, La/vjg;->b:La/yiw;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/vjg;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vjg;->b:La/yiw;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, La/xiw;

    .line 9
    .line 10
    iget-object p0, p0, La/xiw;->a:La/mdm;

    .line 11
    .line 12
    return-object p0

    .line 13
    :pswitch_0
    check-cast p0, La/xiw;

    .line 14
    .line 15
    iget-object p0, p0, La/xiw;->a:La/mdm;

    .line 16
    .line 17
    return-object p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
