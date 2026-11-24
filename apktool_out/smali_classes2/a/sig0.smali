.class public final synthetic La/sig0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:F

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:La/ugd;

.field public final synthetic f:S

.field public final synthetic g:B


# direct methods
.method public synthetic constructor <init>(La/mm40;FFFLa/ugd;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/sig0;->a:La/mm40;

    iput p2, p0, La/sig0;->b:F

    iput p3, p0, La/sig0;->c:F

    iput p4, p0, La/sig0;->d:F

    iput-object p5, p0, La/sig0;->e:La/ugd;

    iput-short p6, p0, La/sig0;->f:S

    iput-byte p7, p0, La/sig0;->g:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-short p1, p0, La/sig0;->f:S

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget-object v0, p0, La/sig0;->a:La/mm40;

    .line 18
    .line 19
    iget v1, p0, La/sig0;->b:F

    .line 20
    .line 21
    iget v2, p0, La/sig0;->c:F

    .line 22
    .line 23
    iget v3, p0, La/sig0;->d:F

    .line 24
    .line 25
    iget-object v4, p0, La/sig0;->e:La/ugd;

    .line 26
    .line 27
    iget-byte v7, p0, La/sig0;->g:B

    .line 28
    .line 29
    invoke-static/range {v0 .. v7}, La/gfx;->d(La/mm40;FFFLa/ugd;La/fet;II)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0
.end method
