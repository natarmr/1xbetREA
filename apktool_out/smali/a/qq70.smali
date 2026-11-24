.class public final synthetic La/qq70;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:La/wvw;

.field public final synthetic c:La/yjj0;

.field public final synthetic d:Lkotlin/jvm/functions/Function0;

.field public final synthetic e:I

.field public final synthetic f:Z

.field public final synthetic g:I

.field public final synthetic h:B


# direct methods
.method public synthetic constructor <init>(La/mm40;La/wvw;La/yjj0;Lkotlin/jvm/functions/Function0;IZII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/qq70;->a:La/mm40;

    iput-object p2, p0, La/qq70;->b:La/wvw;

    iput-object p3, p0, La/qq70;->c:La/yjj0;

    iput-object p4, p0, La/qq70;->d:Lkotlin/jvm/functions/Function0;

    iput p5, p0, La/qq70;->e:I

    iput-boolean p6, p0, La/qq70;->f:Z

    iput p7, p0, La/qq70;->g:I

    iput-byte p8, p0, La/qq70;->h:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/qq70;->g:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v7

    .line 17
    iget-object v0, p0, La/qq70;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/qq70;->b:La/wvw;

    .line 20
    .line 21
    iget-object v2, p0, La/qq70;->c:La/yjj0;

    .line 22
    .line 23
    iget-object v3, p0, La/qq70;->d:Lkotlin/jvm/functions/Function0;

    .line 24
    .line 25
    iget v4, p0, La/qq70;->e:I

    .line 26
    .line 27
    iget-boolean v5, p0, La/qq70;->f:Z

    .line 28
    .line 29
    iget-byte v8, p0, La/qq70;->h:B

    .line 30
    .line 31
    invoke-static/range {v0 .. v8}, La/q5x;->p(La/mm40;La/wvw;La/yjj0;Lkotlin/jvm/functions/Function0;IZLa/fet;II)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method
