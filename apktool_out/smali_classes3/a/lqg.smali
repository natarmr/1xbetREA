.class public final synthetic La/lqg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vqg;


# direct methods
.method public synthetic constructor <init>(La/vqg;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/lqg;->a:B

    iput-object p1, p0, La/lqg;->b:La/vqg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/lqg;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/lqg;->b:La/vqg;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/vqg;->x:La/hqc;

    .line 9
    .line 10
    invoke-virtual {p0}, La/hqc;->a()La/gmq;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    iget-object v0, p0, La/vqg;->F:Ljava/util/List;

    .line 16
    .line 17
    iget-object v1, p0, La/vqg;->q:La/dwu;

    .line 18
    .line 19
    sget-object v2, La/dam0;->b:La/dam0;

    .line 20
    .line 21
    invoke-virtual {v1, v0, v2}, La/dwu;->a(Ljava/util/List;La/dam0;)La/zj2;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    new-instance v1, La/e9g;

    .line 26
    .line 27
    const/4 v2, 0x0

    .line 28
    const/4 v3, 0x7

    .line 29
    invoke-direct {v1, p0, v2, v3}, La/e9g;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 30
    .line 31
    .line 32
    new-instance p0, La/fnq;

    .line 33
    .line 34
    const/4 v2, 0x4

    .line 35
    invoke-direct {p0, v0, v1, v2}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 36
    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
