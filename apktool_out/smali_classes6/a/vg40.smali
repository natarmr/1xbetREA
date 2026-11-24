.class public final synthetic La/vg40;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:F

.field public final synthetic b:F

.field public final synthetic c:La/ugd;

.field public final synthetic d:B


# direct methods
.method public synthetic constructor <init>(FFLa/ugd;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/vg40;->a:F

    iput p2, p0, La/vg40;->b:F

    iput-object p3, p0, La/vg40;->c:La/ugd;

    iput-byte p5, p0, La/vg40;->d:B

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
    const/16 p1, 0x181

    .line 10
    .line 11
    invoke-static {p1}, La/x8x;->L(I)I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    iget v0, p0, La/vg40;->a:F

    .line 16
    .line 17
    iget v1, p0, La/vg40;->b:F

    .line 18
    .line 19
    iget-object v2, p0, La/vg40;->c:La/ugd;

    .line 20
    .line 21
    iget-byte v5, p0, La/vg40;->d:B

    .line 22
    .line 23
    invoke-static/range {v0 .. v5}, La/w9x;->l(FFLa/ugd;La/fet;II)V

    .line 24
    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 27
    .line 28
    return-object p0
.end method
