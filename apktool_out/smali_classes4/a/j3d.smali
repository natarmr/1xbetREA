.class public final synthetic La/j3d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:F

.field public final synthetic c:La/pu90;


# direct methods
.method public synthetic constructor <init>(FLa/pu90;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-byte v0, p0, La/j3d;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/j3d;->b:F

    iput-object p2, p0, La/j3d;->c:La/pu90;

    return-void
.end method

.method public synthetic constructor <init>(La/pu90;FB)V
    .locals 0

    .line 2
    iput-byte p3, p0, La/j3d;->a:B

    iput-object p1, p0, La/j3d;->c:La/pu90;

    iput p2, p0, La/j3d;->b:F

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-byte v0, p0, La/j3d;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x0

    .line 5
    iget v3, p0, La/j3d;->b:F

    .line 6
    .line 7
    iget-object p0, p0, La/j3d;->c:La/pu90;

    .line 8
    .line 9
    check-cast p1, La/ou90;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    float-to-int v0, v3

    .line 20
    invoke-virtual {p1, p0, v2, v0, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 21
    .line 22
    .line 23
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 24
    .line 25
    return-object p0

    .line 26
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    const/high16 v0, 0x3f800000    # 1.0f

    .line 30
    .line 31
    cmpg-float v0, v3, v0

    .line 32
    .line 33
    if-gez v0, :cond_1

    .line 34
    .line 35
    invoke-virtual {p1, p0, v2, v2, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 36
    .line 37
    .line 38
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    if-eqz p0, :cond_2

    .line 45
    .line 46
    float-to-int v0, v3

    .line 47
    invoke-virtual {p1, p0, v2, v0, v1}, La/ou90;->g(La/pu90;IIF)V

    .line 48
    .line 49
    .line 50
    :cond_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
