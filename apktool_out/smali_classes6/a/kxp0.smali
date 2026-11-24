.class public final synthetic La/kxp0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/lxp0;


# direct methods
.method public synthetic constructor <init>(La/lxp0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kxp0;->a:B

    iput-object p1, p0, La/kxp0;->b:La/lxp0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/kxp0;->a:B

    iget-object p0, p0, La/kxp0;->b:La/lxp0;

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, La/lxp0;->j(La/lxp0;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :pswitch_0
    invoke-static {p0}, La/lxp0;->i(La/lxp0;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :pswitch_1
    invoke-static {p0}, La/lxp0;->b(La/lxp0;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
