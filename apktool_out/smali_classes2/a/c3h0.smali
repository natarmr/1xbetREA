.class public final La/c3h0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:La/zie0;

.field public static final synthetic e:[La/iiy;


# instance fields
.field public final a:La/h1;

.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:La/cu00;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/j0d0;

    .line 2
    .line 3
    const-class v1, La/c3h0;

    .line 4
    .line 5
    const-string v2, "scopeForOwnerModule"

    .line 6
    .line 7
    const-string v3, "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct {v0, v1, v2, v3, v4}, La/j0d0;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    new-array v1, v1, [La/iiy;

    .line 15
    .line 16
    aput-object v0, v1, v4

    .line 17
    .line 18
    sput-object v1, La/c3h0;->e:[La/iiy;

    .line 19
    .line 20
    new-instance v0, La/zie0;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/c3h0;->d:La/zie0;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(La/h1;La/eu00;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/c3h0;->a:La/h1;

    .line 5
    .line 6
    iput-object p3, p0, La/c3h0;->b:Lkotlin/jvm/functions/Function1;

    .line 7
    .line 8
    new-instance p1, La/yxf0;

    .line 9
    .line 10
    const/16 p3, 0xd

    .line 11
    .line 12
    invoke-direct {p1, p0, p3}, La/yxf0;-><init>(Ljava/lang/Object;B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    new-instance p3, La/cu00;

    .line 19
    .line 20
    invoke-direct {p3, p2, p1}, La/bu00;-><init>(La/eu00;Lkotlin/jvm/functions/Function0;)V

    .line 21
    .line 22
    .line 23
    iput-object p3, p0, La/c3h0;->c:La/cu00;

    .line 24
    .line 25
    return-void
.end method
