.class public final synthetic La/zln0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hzj;


# direct methods
.method public synthetic constructor <init>(La/hzj;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zln0;->a:B

    iput-object p1, p0, La/zln0;->b:La/hzj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    .line 1
    iget-byte v0, p0, La/zln0;->a:B

    iget-object p0, p0, La/zln0;->b:La/hzj;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, La/hzj;->b()V

    return-void

    :pswitch_0
    invoke-virtual {p0}, La/hzj;->a()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
