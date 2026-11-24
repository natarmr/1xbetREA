.class public final synthetic La/i15;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:La/mm40;

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:La/y9q0;

.field public final synthetic h:S

.field public final synthetic i:S


# direct methods
.method public synthetic constructor <init>(La/mm40;Ljava/lang/String;Ljava/lang/String;JJJLa/y9q0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/i15;->a:La/mm40;

    iput-object p2, p0, La/i15;->b:Ljava/lang/String;

    iput-object p3, p0, La/i15;->c:Ljava/lang/String;

    iput-wide p4, p0, La/i15;->d:J

    iput-wide p6, p0, La/i15;->e:J

    iput-wide p8, p0, La/i15;->f:J

    iput-object p10, p0, La/i15;->g:La/y9q0;

    iput-short p11, p0, La/i15;->h:S

    iput-short p12, p0, La/i15;->i:S

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    move-object v10, p1

    .line 2
    check-cast v10, La/fet;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-short p1, p0, La/i15;->h:S

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, La/x8x;->L(I)I

    .line 14
    .line 15
    .line 16
    move-result v11

    .line 17
    iget-object v0, p0, La/i15;->a:La/mm40;

    .line 18
    .line 19
    iget-object v1, p0, La/i15;->b:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v2, p0, La/i15;->c:Ljava/lang/String;

    .line 22
    .line 23
    iget-wide v3, p0, La/i15;->d:J

    .line 24
    .line 25
    iget-wide v5, p0, La/i15;->e:J

    .line 26
    .line 27
    iget-wide v7, p0, La/i15;->f:J

    .line 28
    .line 29
    iget-object v9, p0, La/i15;->g:La/y9q0;

    .line 30
    .line 31
    iget-short v12, p0, La/i15;->i:S

    .line 32
    .line 33
    invoke-static/range {v0 .. v12}, La/y9a;->h(La/mm40;Ljava/lang/String;Ljava/lang/String;JJJLa/y9q0;La/fet;II)V

    .line 34
    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    return-object p0
.end method
