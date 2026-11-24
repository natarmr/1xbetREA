.class public final synthetic La/kss0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F


# direct methods
.method public synthetic constructor <init>(FB)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kss0;->a:B

    iput p1, p0, La/kss0;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/kss0;->a:B

    .line 2
    .line 3
    iget p0, p0, La/kss0;->b:F

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p1, La/t2e;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/high16 v0, 0x42600000    # 56.0f

    .line 14
    .line 15
    sub-float/2addr v0, p0

    .line 16
    new-instance p0, La/wmk;

    .line 17
    .line 18
    new-instance v1, La/ycl;

    .line 19
    .line 20
    invoke-direct {v1, v0}, La/ycl;-><init>(F)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    invoke-direct {p0, v1, v0}, La/wmk;-><init>(La/ycl;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1, p0}, La/t2e;->c(La/wmk;)V

    .line 28
    .line 29
    .line 30
    sget-object p0, La/ouu0;->c:La/ouu0;

    .line 31
    .line 32
    invoke-virtual {p1, p0}, La/t2e;->d(La/ouu0;)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 36
    .line 37
    return-object p0

    .line 38
    :pswitch_0
    check-cast p1, La/z3e;

    .line 39
    .line 40
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    new-instance v0, La/u2e;

    .line 44
    .line 45
    const-string v1, "CONTENT_ID"

    .line 46
    .line 47
    invoke-direct {v0, v1}, La/u2e;-><init>(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    new-instance v1, La/kss0;

    .line 51
    .line 52
    const/4 v2, 0x1

    .line 53
    invoke-direct {v1, p0, v2}, La/kss0;-><init>(FB)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v0, v1}, La/d3e;->c(La/u2e;Lkotlin/jvm/functions/Function1;)V

    .line 57
    .line 58
    .line 59
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 60
    .line 61
    return-object p0

    .line 62
    nop

    .line 63
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
