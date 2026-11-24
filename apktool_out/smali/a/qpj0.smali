.class public final synthetic La/qpj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/w6k;

.field public final synthetic c:F


# direct methods
.method public synthetic constructor <init>(La/w6k;FB)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/qpj0;->a:B

    iput-object p1, p0, La/qpj0;->b:La/w6k;

    iput p2, p0, La/qpj0;->c:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/qpj0;->a:B

    .line 2
    .line 3
    iget v1, p0, La/qpj0;->c:F

    .line 4
    .line 5
    iget-object p0, p0, La/qpj0;->b:La/w6k;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-interface {p0, v1}, La/w6k;->w0(F)F

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    :goto_0
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0

    .line 19
    :pswitch_0
    invoke-interface {p0, v1}, La/w6k;->w0(F)F

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    goto :goto_0

    .line 24
    nop

    .line 25
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
