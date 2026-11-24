.class public final La/b8t0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final b:La/b8t0;


# instance fields
.field public final synthetic a:La/g0o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, La/b8t0;

    .line 2
    .line 3
    invoke-direct {v0}, La/b8t0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, La/b8t0;->b:La/b8t0;

    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/g0o;

    .line 5
    .line 6
    const-string v1, "kotlin.Unit"

    .line 7
    .line 8
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 9
    .line 10
    invoke-direct {v0, v1, v2}, La/g0o;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, La/b8t0;->a:La/g0o;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final deserialize(La/rkj;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/b8t0;->a:La/g0o;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, La/g0o;->deserialize(La/rkj;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 7
    .line 8
    return-object p0
.end method

.method public final getDescriptor()La/ugi0;
    .locals 0

    .line 1
    iget-object p0, p0, La/b8t0;->a:La/g0o;

    .line 2
    .line 3
    invoke-virtual {p0}, La/g0o;->getDescriptor()La/ugi0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final serialize(La/bwn;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lkotlin/Unit;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/b8t0;->a:La/g0o;

    .line 7
    .line 8
    invoke-virtual {p0, p1, p2}, La/g0o;->serialize(La/bwn;Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method
