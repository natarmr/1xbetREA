.class public final synthetic La/g6n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:La/sso0;

.field public final synthetic c:La/mm40;

.field public final synthetic d:Z

.field public final synthetic e:B

.field public final synthetic f:I

.field public final synthetic g:B


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;La/sso0;La/mm40;IIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/g6n;->a:Ljava/lang/String;

    iput-object p2, p0, La/g6n;->b:La/sso0;

    iput-object p3, p0, La/g6n;->c:La/mm40;

    iput-boolean p4, p0, La/g6n;->d:Z

    iput-byte p5, p0, La/g6n;->e:B

    iput p6, p0, La/g6n;->f:I

    iput-byte p7, p0, La/g6n;->g:B

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
    iget p1, p0, La/g6n;->f:I

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
    iget-object v0, p0, La/g6n;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, La/g6n;->b:La/sso0;

    .line 20
    .line 21
    iget-object v2, p0, La/g6n;->c:La/mm40;

    .line 22
    .line 23
    iget-boolean v3, p0, La/g6n;->d:Z

    .line 24
    .line 25
    iget-byte v4, p0, La/g6n;->e:B

    .line 26
    .line 27
    iget-byte v7, p0, La/g6n;->g:B

    .line 28
    .line 29
    invoke-static/range {v0 .. v7}, La/j6n;->h(Ljava/lang/String;La/sso0;La/mm40;IILa/fet;II)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0
.end method
