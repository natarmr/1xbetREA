.class public final synthetic La/ywp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:La/mdm;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;

.field public final synthetic d:B


# direct methods
.method public synthetic constructor <init>(FLa/mdm;Lkotlin/jvm/functions/Function0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/ywp;->a:F

    iput-object p2, p0, La/ywp;->b:La/mdm;

    iput-object p3, p0, La/ywp;->c:Lkotlin/jvm/functions/Function0;

    iput-byte p5, p0, La/ywp;->d:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v3, p1

    .line 2
    check-cast v3, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, La/x8x;->L(I)I

    .line 11
    .line 12
    .line 13
    move-result v4

    .line 14
    iget v0, p0, La/ywp;->a:F

    .line 15
    .line 16
    iget-object v1, p0, La/ywp;->b:La/mdm;

    .line 17
    .line 18
    iget-object v2, p0, La/ywp;->c:Lkotlin/jvm/functions/Function0;

    .line 19
    .line 20
    iget-byte v5, p0, La/ywp;->d:B

    .line 21
    .line 22
    invoke-static/range {v0 .. v5}, La/x8f;->i(FLa/mdm;Lkotlin/jvm/functions/Function0;La/fet;II)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0
.end method
