.class public final synthetic La/lsk;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/qsk;

.field public final synthetic b:La/l7m0;

.field public final synthetic c:La/l7m0;

.field public final synthetic d:F

.field public final synthetic e:F

.field public final synthetic f:F

.field public final synthetic g:F

.field public final synthetic h:Lkotlin/jvm/functions/Function1;

.field public final synthetic i:I


# direct methods
.method public synthetic constructor <init>(La/qsk;La/l7m0;La/l7m0;FFFFLkotlin/jvm/functions/Function1;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/lsk;->a:La/qsk;

    iput-object p2, p0, La/lsk;->b:La/l7m0;

    iput-object p3, p0, La/lsk;->c:La/l7m0;

    iput p4, p0, La/lsk;->d:F

    iput p5, p0, La/lsk;->e:F

    iput p6, p0, La/lsk;->f:F

    iput p7, p0, La/lsk;->g:F

    iput-object p8, p0, La/lsk;->h:Lkotlin/jvm/functions/Function1;

    iput p9, p0, La/lsk;->i:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/lsk;->i:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v9

    .line 17
    iget-object v0, p0, La/lsk;->a:La/qsk;

    .line 18
    .line 19
    iget-object v1, p0, La/lsk;->b:La/l7m0;

    .line 20
    .line 21
    iget-object v2, p0, La/lsk;->c:La/l7m0;

    .line 22
    .line 23
    iget v3, p0, La/lsk;->d:F

    .line 24
    .line 25
    iget v4, p0, La/lsk;->e:F

    .line 26
    .line 27
    iget v5, p0, La/lsk;->f:F

    .line 28
    .line 29
    iget v6, p0, La/lsk;->g:F

    .line 30
    .line 31
    iget-object v7, p0, La/lsk;->h:Lkotlin/jvm/functions/Function1;

    .line 32
    .line 33
    invoke-static/range {v0 .. v9}, La/qcc;->e(La/qsk;La/l7m0;La/l7m0;FFFFLkotlin/jvm/functions/Function1;La/fet;I)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0
.end method
