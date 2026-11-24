.class public final synthetic La/p460;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/s460;


# direct methods
.method public synthetic constructor <init>(La/s460;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/p460;->a:B

    iput-object p1, p0, La/p460;->b:La/s460;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/p460;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/p460;->b:La/s460;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/s460;->w:La/s460;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, La/s460;->o1()V

    .line 13
    .line 14
    .line 15
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_0
    iget-object v0, p0, La/s460;->q1:La/x5a;

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    iget-object v1, p0, La/s460;->p1:La/dfv;

    .line 24
    .line 25
    invoke-virtual {p0, v0, v1}, La/s460;->a1(La/x5a;La/dfv;)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
