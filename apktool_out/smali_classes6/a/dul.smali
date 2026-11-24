.class public final synthetic La/dul;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:J

.field public final synthetic d:B

.field public final synthetic e:J

.field public final synthetic f:I

.field public final synthetic g:B


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;JIJII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/dul;->a:La/mm40;

    iput-object p2, p0, La/dul;->b:Ljava/lang/String;

    iput-wide p3, p0, La/dul;->c:J

    iput-byte p5, p0, La/dul;->d:B

    iput-wide p6, p0, La/dul;->e:J

    iput p8, p0, La/dul;->f:I

    iput-byte p9, p0, La/dul;->g:B

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
    iget p1, p0, La/dul;->f:I

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
    iget-object v0, p0, La/dul;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/dul;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget-wide v2, p0, La/dul;->c:J

    .line 22
    .line 23
    iget-byte v4, p0, La/dul;->d:B

    .line 24
    .line 25
    iget-wide v5, p0, La/dul;->e:J

    .line 26
    .line 27
    iget-byte v9, p0, La/dul;->g:B

    .line 28
    .line 29
    invoke-static/range {v0 .. v9}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 30
    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object p0
.end method
