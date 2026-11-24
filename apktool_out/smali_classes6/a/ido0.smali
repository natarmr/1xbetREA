.class public final synthetic La/ido0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/jdk0;

.field public final synthetic b:La/mm40;

.field public final synthetic c:F

.field public final synthetic d:F

.field public final synthetic e:J

.field public final synthetic f:La/yjj0;

.field public final synthetic g:I

.field public final synthetic h:B


# direct methods
.method public synthetic constructor <init>(La/jdk0;La/mm40;FFJLa/yjj0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/ido0;->a:La/jdk0;

    iput-object p2, p0, La/ido0;->b:La/mm40;

    iput p3, p0, La/ido0;->c:F

    iput p4, p0, La/ido0;->d:F

    iput-wide p5, p0, La/ido0;->e:J

    iput-object p7, p0, La/ido0;->f:La/yjj0;

    iput p8, p0, La/ido0;->g:I

    iput-byte p9, p0, La/ido0;->h:B

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, La/ido0;->g:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-object v0, p0, La/ido0;->a:La/jdk0;

    .line 18
    .line 19
    iget-object v1, p0, La/ido0;->b:La/mm40;

    .line 20
    .line 21
    iget v2, p0, La/ido0;->c:F

    .line 22
    .line 23
    iget v3, p0, La/ido0;->d:F

    .line 24
    .line 25
    iget-wide v4, p0, La/ido0;->e:J

    .line 26
    .line 27
    iget-object v6, p0, La/ido0;->f:La/yjj0;

    .line 28
    .line 29
    iget-byte v9, p0, La/ido0;->h:B

    .line 30
    .line 31
    invoke-virtual/range {v0 .. v9}, La/jdk0;->b(La/mm40;FFJLa/yjj0;La/fet;II)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0
.end method
