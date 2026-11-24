.class public final synthetic La/c4w0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/d4w0;


# direct methods
.method public synthetic constructor <init>(La/d4w0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/c4w0;->a:B

    iput-object p1, p0, La/c4w0;->b:La/d4w0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/c4w0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/c4w0;->b:La/d4w0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/hy40;

    .line 9
    .line 10
    iget-object p0, p0, La/d4w0;->d:La/n0o0;

    .line 11
    .line 12
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    check-cast p0, La/e4w0;

    .line 17
    .line 18
    invoke-direct {v0, p0}, La/wh00;-><init>(Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-object v0

    .line 22
    :pswitch_0
    new-instance v0, La/e4w0;

    .line 23
    .line 24
    iget v1, p0, La/d4w0;->b:F

    .line 25
    .line 26
    iget p0, p0, La/d4w0;->c:F

    .line 27
    .line 28
    const/high16 v2, 0x3f800000    # 1.0f

    .line 29
    .line 30
    invoke-direct {v0, v2, v1, p0}, La/e4w0;-><init>(FFF)V

    .line 31
    .line 32
    .line 33
    return-object v0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
