.class public final La/r6b0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/u6b0;


# direct methods
.method public synthetic constructor <init>(La/u6b0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/r6b0;->a:B

    iput-object p1, p0, La/r6b0;->b:La/u6b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/r6b0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/r6b0;->b:La/u6b0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    return-object p0

    .line 9
    :pswitch_0
    sget-object v0, La/u6b0;->e2:La/xi70;

    .line 10
    .line 11
    invoke-virtual {p0}, La/u6b0;->J0()La/sbb0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object v0, p0, La/sbb0;->T:La/gg5;

    .line 16
    .line 17
    iget-object v0, v0, La/gg5;->a:La/s1p;

    .line 18
    .line 19
    const-wide/16 v1, 0x3171

    .line 20
    .line 21
    sget-object v3, La/xun;->a:La/xun;

    .line 22
    .line 23
    invoke-virtual {v0, v3, v1, v2}, La/s1p;->a(Ljava/util/Set;J)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, La/sbb0;->U:La/zg;

    .line 27
    .line 28
    iget-object p0, p0, La/zg;->a:La/kt2;

    .line 29
    .line 30
    const-string v0, "notification_permission_show"

    .line 31
    .line 32
    invoke-interface {p0, v0}, La/kt2;->c(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
