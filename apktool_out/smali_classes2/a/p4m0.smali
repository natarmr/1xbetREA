.class public final La/p4m0;
.super La/pzs0;
.source "SourceFile"


# instance fields
.field public final a:La/kzj0;


# direct methods
.method public constructor <init>(La/ary;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, La/ary;->p()La/kzj0;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La/p4m0;->a:La/kzj0;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final b()La/wsy;
    .locals 0

    .line 1
    iget-object p0, p0, La/p4m0;->a:La/kzj0;

    .line 2
    .line 3
    return-object p0
.end method
