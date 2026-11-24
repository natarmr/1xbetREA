.class public final synthetic La/q0i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/vpl;

.field public final synthetic c:F

.field public final synthetic d:I

.field public final synthetic e:I


# direct methods
.method public synthetic constructor <init>(La/mm40;La/vpl;FII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/q0i;->a:La/mm40;

    iput-object p2, p0, La/q0i;->b:La/vpl;

    iput p3, p0, La/q0i;->c:F

    iput p4, p0, La/q0i;->d:I

    iput p5, p0, La/q0i;->e:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/q0i;->e:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    iget-object v0, p0, La/q0i;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/q0i;->b:La/vpl;

    .line 20
    .line 21
    iget v2, p0, La/q0i;->c:F

    .line 22
    .line 23
    iget v3, p0, La/q0i;->d:I

    .line 24
    .line 25
    invoke-static/range {v0 .. v5}, La/ccq0;->o(La/mm40;La/vpl;FILa/fet;I)V

    .line 26
    .line 27
    .line 28
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 29
    .line 30
    return-object p0
.end method
