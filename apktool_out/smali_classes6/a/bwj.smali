.class public final La/bwj;
.super La/xk80;
.source "SourceFile"


# static fields
.field public static final I:La/v0h0;


# instance fields
.field public final H:La/pz40;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, La/svj;

    .line 2
    .line 3
    const/4 v1, 0x4

    .line 4
    invoke-direct {v0, v1}, La/svj;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, La/x2i;

    .line 8
    .line 9
    const/16 v2, 0x17

    .line 10
    .line 11
    invoke-direct {v1, v2}, La/x2i;-><init>(B)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v0}, La/qxw;->L(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)La/v0h0;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    sput-object v0, La/bwj;->I:La/v0h0;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(IFLkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2, p1}, La/xk80;-><init>(FI)V

    .line 5
    .line 6
    .line 7
    invoke-static {p3}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iput-object p1, p0, La/bwj;->H:La/pz40;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final n()I
    .locals 0

    .line 1
    iget-object p0, p0, La/bwj;->H:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lkotlin/jvm/functions/Function0;

    .line 10
    .line 11
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Ljava/lang/Number;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    return p0
.end method
