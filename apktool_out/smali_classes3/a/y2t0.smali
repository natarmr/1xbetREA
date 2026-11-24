.class public final synthetic La/y2t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Lkotlin/jvm/functions/Function1;

.field public final synthetic c:La/vzg0;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/vzg0;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/y2t0;->a:B

    iput-object p1, p0, La/y2t0;->b:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/y2t0;->c:La/vzg0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/y2t0;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/y2t0;->c:La/vzg0;

    .line 4
    .line 5
    iget-object p0, p0, La/y2t0;->b:Lkotlin/jvm/functions/Function1;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0

    .line 15
    :pswitch_0
    invoke-interface {p0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    nop

    .line 21
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
