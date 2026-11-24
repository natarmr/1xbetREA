.class public final synthetic La/fdg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/vcg0;

.field public final synthetic c:S

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(La/mm40;La/gdg0;La/vcg0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/fdg0;->a:La/mm40;

    iput-object p3, p0, La/fdg0;->b:La/vcg0;

    iput-short p4, p0, La/fdg0;->c:S

    iput-boolean p5, p0, La/fdg0;->d:Z

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
    iget-short p1, p0, La/fdg0;->c:S

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    iget-object v0, p0, La/fdg0;->a:La/mm40;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    iget-object v2, p0, La/fdg0;->b:La/vcg0;

    .line 21
    .line 22
    iget-boolean v5, p0, La/fdg0;->d:Z

    .line 23
    .line 24
    invoke-static/range {v0 .. v5}, La/q7x;->m(La/mm40;La/gdg0;La/vcg0;La/fet;II)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    return-object p0
.end method
