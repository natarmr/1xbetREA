.class public final synthetic La/jba0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/my90;

.field public final synthetic b:La/mm40;

.field public final synthetic c:I

.field public final synthetic d:S


# direct methods
.method public synthetic constructor <init>(La/my90;La/mm40;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/jba0;->a:La/my90;

    iput-object p2, p0, La/jba0;->b:La/mm40;

    iput p3, p0, La/jba0;->c:I

    iput-short p4, p0, La/jba0;->d:S

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, La/fet;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-short p2, p0, La/jba0;->d:S

    .line 9
    .line 10
    or-int/lit8 p2, p2, 0x1

    .line 11
    .line 12
    invoke-static {p2}, La/x8x;->L(I)I

    .line 13
    .line 14
    .line 15
    move-result p2

    .line 16
    iget-object v0, p0, La/jba0;->a:La/my90;

    .line 17
    .line 18
    iget-object v1, p0, La/jba0;->b:La/mm40;

    .line 19
    .line 20
    iget p0, p0, La/jba0;->c:I

    .line 21
    .line 22
    invoke-static {v0, v1, p0, p1, p2}, La/e9x;->t(La/my90;La/mm40;ILa/fet;I)V

    .line 23
    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 26
    .line 27
    return-object p0
.end method
