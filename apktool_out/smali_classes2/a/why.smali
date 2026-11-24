.class public final La/why;
.super Ljava/lang/Object;

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final b:La/zhy;


# direct methods
.method public synthetic constructor <init>(La/zhy;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/why;->a:B

    iput-object p1, p0, La/why;->b:La/zhy;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/why;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/why;->b:La/zhy;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/zhy;->b:Ljava/lang/Class;

    .line 9
    .line 10
    invoke-static {p0}, La/zvw;->N(Ljava/lang/Class;)La/jre0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    new-instance v0, La/yhy;

    .line 16
    .line 17
    invoke-direct {v0, p0}, La/yhy;-><init>(La/zhy;)V

    .line 18
    .line 19
    .line 20
    return-object v0

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
